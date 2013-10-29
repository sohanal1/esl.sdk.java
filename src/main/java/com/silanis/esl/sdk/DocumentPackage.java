package com.silanis.esl.sdk;

import com.silanis.esl.api.model.BaseMessage;
import com.silanis.esl.api.model.Package;
import com.silanis.esl.api.model.PackageStatus;
import com.silanis.esl.api.model.Role;
import com.silanis.esl.api.util.JacksonUtil;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * 
 * DocumentPackage class describes all assets required for a complete signing transaction.
 * It contains information about signers, documents, signatures, 
 * fields and settings for displaying the signing ceremony
 */
public class DocumentPackage implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final Map<String, Signer> signers;
    private final Map<String, Document> documents;
    private final boolean autocomplete;
    private String description;
    private Date expiryDate;
    private String packageMessage;
    private PackageId id;
    private PackageStatus status;
    private DocumentPackageSettings settings;
    private Locale language;
    private Map<String, Object> attributes;

    /**
     * 
     * 
     * @param name			the name of the package
     * @param signers		the Map of signers
     * @param documents		the Map of documents
     * @param autocomplete	the autocomplete status. If it is set to true, 
     * 						then the document package will be marked as completed automatically by the system
     */
    public DocumentPackage(String name, Map<String, Signer> signers, Map<String, Document> documents, boolean autocomplete) {
        this.name = name;
        this.signers = signers;
        this.documents = documents;
        this.autocomplete = autocomplete;
    }

    /**
     * 
     * @return the document package name
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves a signer by its email address
     * 
     * @param email
     * @return the signer who's email address matches the one provided as parameter
     */
    public Signer getSigner(String email) {
        return signers.get(email);
    }
    /**
     * 
     * @param name	the document name
     * @return the document identified by the name provided as parameter
     */
    public Document getDocument(String name) {
        return documents.get(name);
    }

    /**
     * Returns the autocomplete status
     * @return	<code>true</code> if the autocomplete status is set to true
     * 			<code>false</code> otherwise.
     */
    public boolean getAutocomplete() {
        return autocomplete;
    }

    /**
     * 
     * @return
     */
    Package toAPIPackage() {
        Package packageToCreate = new Package()
                .setName(name)
                .setDue(expiryDate)
                .setEmailMessage(packageMessage)
                .setDescription(description)
                .setAutocomplete(autocomplete)
                .setData(JacksonUtil.deserialize(attributes.toString(), Map.class));

        if (language != null) {
            packageToCreate.setLanguage(language.getLanguage());
        }

        if ( settings != null ) {
            packageToCreate.setSettings(settings.toAPIPackageSettings());
        }

        int signerCount = 1;
        for (Signer signer : signers.values()) {
            Role role = new Role()
                    .setName( signer.getId() == null ? "signer" + signerCount : signer.getId() )
                    .addSigner( signer.toAPISigner() )
                    .setIndex( signer.getSigningOrder() )
                    .setReassign( signer.canChangeSigner() )
                    .setId( signer.getId() == null ? "role" + signerCount : signer.getId() );

            signerCount++;

            if ( signer.getMessage() != null ) {
                role.setEmailMessage( new BaseMessage().setContent( signer.getMessage() ) );
            }

            packageToCreate.addRole(role);
        }

        return packageToCreate;
    }

    /**
     * Retrieve all the package documents
     * 
     * @return	Collection of documents
     */
    public Collection<Document> getDocuments() {
        return documents.values();
    }
    
    /**
     * Sets the description for the document package
     * 
     * @param description	Description of the package
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the expiration date for the document package.
     * TODO: What is happening after the date surpasses the expiration date and the transaction is not yet completed?
     * 
     * @param expiryDate
     */
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Sets the package message
     *
     * 
     * @param packageMessage	This is a message that will get added to the email invitation sent to all signers of a package
     */
    public void setPackageMessage(String packageMessage) {
        this.packageMessage = packageMessage;
    }

    public void setId( PackageId id ) {
        this.id = id;
    }

    public PackageId getId() {
        return id;
    }

    public void setStatus( PackageStatus status ) {
        this.status = status;
    }

    public PackageStatus getStatus() {
        return status;
    }

    public DocumentPackageSettings getSettings() {
        return settings;
    }

    public void setSettings( DocumentPackageSettings settings ) {
        this.settings = settings;
    }

    public void setLanguage(Locale language) {
        this.language = language;
    }

    public Locale getLanguage() {
        return language;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }
}
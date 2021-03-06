package com.silanis.esl.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.silanis.esl.api.util.SchemaSanitizer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NotaryHostThankYouOptions extends Model
        implements java.io.Serializable {

    @JsonIgnore
    public static final String FIELD_TITLE = "title";
    @JsonIgnore
    public static final String FIELD_BODY = "body";
    @JsonIgnore
    public static final String FIELD_RECIPIENTNAME = "recipientName";
    @JsonIgnore
    public static final String FIELD_RECIPIENTEMAIL = "recipientEmail";
    @JsonIgnore
    public static final String FIELD_RECIPIENTROLE = "recipientRole";
    @JsonIgnore
    public static final String FIELD_NOTARYTAG = "notaryTag";
    @JsonIgnore
    public static final String FIELD_RECIPIENTSTATUS = "recipientStatus";
    @JsonIgnore
    public static final String FIELD_DOWNLOADBUTTON = "downloadButton";
    @JsonIgnore
    public static final String FIELD_REVIEWDOCUMENTSBUTTON = "reviewDocumentsButton";

    protected Boolean _title = true;
    protected Boolean _body = true;
    protected Boolean _recipientName = true;
    protected Boolean _recipientEmail = true;
    protected Boolean _recipientRole = true;
    protected Boolean _notaryTag = true;
    protected Boolean _recipientStatus = true;
    protected Boolean _downloadButton = true;
    protected Boolean _reviewDocumentsButton = true;

    // Empty Constructor
    public NotaryHostThankYouOptions() {
        // Do nothing
    }

    @JsonIgnore
    public NotaryHostThankYouOptions safeSetTitle(Boolean value) {
        if (value != null) {
            this.setTitle(value);
        }
        return this;
    }

    public Boolean getTitle() {
        return _title;
    }

    public NotaryHostThankYouOptions setTitle(Boolean value) {
        SchemaSanitizer.throwOnNull(FIELD_TITLE, value);
        this._title = value;
        setDirty(FIELD_TITLE);
        return this;
    }

    @JsonIgnore
    public boolean evalTitle() {
        return _title == null || _title.booleanValue();
    }

    @JsonIgnore
    public NotaryHostThankYouOptions safeSetBody(Boolean value) {
        if (value != null) {
            this.setBody(value);
        }
        return this;
    }

    public Boolean getBody() {
        return _body;
    }

    public NotaryHostThankYouOptions setBody(Boolean value) {
        SchemaSanitizer.throwOnNull(FIELD_BODY, value);
        this._body = value;
        setDirty(FIELD_BODY);
        return this;
    }

    @JsonIgnore
    public boolean evalBody() {
        return _body == null || _body.booleanValue();
    }

    @JsonIgnore
    public NotaryHostThankYouOptions safeSetRecipientName(Boolean value) {
        if (value != null) {
            this.setRecipientName(value);
        }
        return this;
    }

    public Boolean getRecipientName() {
        return _recipientName;
    }

    public NotaryHostThankYouOptions setRecipientName(Boolean value) {
        SchemaSanitizer.throwOnNull(FIELD_RECIPIENTNAME, value);
        this._recipientName = value;
        setDirty(FIELD_RECIPIENTNAME);
        return this;
    }

    @JsonIgnore
    public boolean evalRecipientName() {
        return _recipientName == null || _recipientName.booleanValue();
    }

    @JsonIgnore
    public NotaryHostThankYouOptions safeSetRecipientEmail(Boolean value) {
        if (value != null) {
            this.setRecipientEmail(value);
        }
        return this;
    }

    public Boolean getRecipientEmail() {
        return _recipientEmail;
    }

    public NotaryHostThankYouOptions setRecipientEmail(Boolean value) {
        SchemaSanitizer.throwOnNull(FIELD_RECIPIENTEMAIL, value);
        this._recipientEmail = value;
        setDirty(FIELD_RECIPIENTEMAIL);
        return this;
    }

    @JsonIgnore
    public boolean evalRecipientEmail() {
        return _recipientEmail == null || _recipientEmail.booleanValue();
    }

    @JsonIgnore
    public NotaryHostThankYouOptions safeSetRecipientRole(Boolean value) {
        if (value != null) {
            this.setRecipientRole(value);
        }
        return this;
    }

    public Boolean getRecipientRole() {
        return _recipientRole;
    }

    public NotaryHostThankYouOptions setRecipientRole(Boolean value) {
        SchemaSanitizer.throwOnNull(FIELD_RECIPIENTROLE, value);
        this._recipientRole = value;
        setDirty(FIELD_RECIPIENTROLE);
        return this;
    }

    @JsonIgnore
    public boolean evalRecipientRole() {
        return _recipientRole == null || _recipientRole.booleanValue();
    }

    @JsonIgnore
    public NotaryHostThankYouOptions safeSetNotaryTag(Boolean value) {
        if (value != null) {
            this.setNotaryTag(value);
        }
        return this;
    }

    public Boolean getNotaryTag() {
        return _notaryTag;
    }

    public NotaryHostThankYouOptions setNotaryTag(Boolean value) {
        SchemaSanitizer.throwOnNull(FIELD_NOTARYTAG, value);
        this._notaryTag = value;
        setDirty(FIELD_NOTARYTAG);
        return this;
    }

    @JsonIgnore
    public boolean evalNotaryTag() {
        return _notaryTag == null || _notaryTag.booleanValue();
    }

    @JsonIgnore
    public NotaryHostThankYouOptions safeSetRecipientStatus(Boolean value) {
        if (value != null) {
            this.setRecipientStatus(value);
        }
        return this;
    }

    public Boolean getRecipientStatus() {
        return _recipientStatus;
    }

    public NotaryHostThankYouOptions setRecipientStatus(Boolean value) {
        SchemaSanitizer.throwOnNull(FIELD_RECIPIENTSTATUS, value);
        this._recipientStatus = value;
        setDirty(FIELD_RECIPIENTSTATUS);
        return this;
    }

    @JsonIgnore
    public boolean evalRecipientStatus() {
        return _recipientStatus == null || _recipientStatus.booleanValue();
    }

    @JsonIgnore
    public NotaryHostThankYouOptions safeSetDownloadButton(Boolean value) {
        if (value != null) {
            this.setDownloadButton(value);
        }
        return this;
    }

    public Boolean getDownloadButton() {
        return _downloadButton;
    }

    public NotaryHostThankYouOptions setDownloadButton(Boolean value) {
        SchemaSanitizer.throwOnNull(FIELD_DOWNLOADBUTTON, value);
        this._downloadButton = value;
        setDirty(FIELD_DOWNLOADBUTTON);
        return this;
    }

    @JsonIgnore
    public boolean evalDownloadButton() {
        return _downloadButton == null || _downloadButton.booleanValue();
    }

    @JsonIgnore
    public NotaryHostThankYouOptions safeSetReviewDocumentsButton(Boolean value) {
        if (value != null) {
            this.setReviewDocumentsButton(value);
        }
        return this;
    }

    public Boolean getReviewDocumentsButton() {
        return _reviewDocumentsButton;
    }

    public NotaryHostThankYouOptions setReviewDocumentsButton(Boolean value) {
        SchemaSanitizer.throwOnNull(FIELD_REVIEWDOCUMENTSBUTTON, value);
        this._reviewDocumentsButton = value;
        setDirty(FIELD_REVIEWDOCUMENTSBUTTON);
        return this;
    }

    @JsonIgnore
    public boolean evalReviewDocumentsButton() {
        return _reviewDocumentsButton == null || _reviewDocumentsButton.booleanValue();
    }
}
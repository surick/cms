package com.froala.editor.file;

import com.froala.editor.CustomValidation;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.ArrayUtils;

/**
 * File validation.
 *
 * @author florin@froala.com
 */
public class FileValidation {

    /**
     * Allowed file validation default extensions.
     */
    public static final String[] allowedFileExtsDefault = new String[]{
            "txt", "pdf", "doc", "docx",
            "xls", "xlsx", "ppt", "pptx", "zip", "rar", "mp4", "mp3"};

    /**
     * Allowed file validation default mimetypes.
     */
    public static final String[] allowedFileMimeTypesDefault = new String[]{
            "text/plain", "application/msword", "application/x-pdf", "application/pdf", "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
            "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.ms-powerpoint", "application/vnd.openxmlformats-officedocument.presentationml.presentation",
            "application/zip", "application/x-rar-compressed", "video/mp4", "audio/mpeg"
    };

    /**
     * Allowed validation extensions.
     */
    protected String[] allowedExts;

    /**
     * Allowed validation mimetypes.
     */
    protected String[] allowedMimeTypes;

    /**
     * Custom file validation.
     */
    protected CustomValidation customValidation;

    /**
     * Init default file validation settings.
     */
    protected void initDefault() {

        allowedExts = allowedFileExtsDefault;
        allowedMimeTypes = allowedFileMimeTypesDefault;
    }

    /**
     * Constructor. Validates default files with: - allowed file extensions:
     * "txt", "pdf", "doc" - allowed mime types: "text/plain",
     * "application/msword", "application/x-pdf", "application/pdf"
     */
    public FileValidation() {

        initDefault();
    }

    /**
     * Constructor.
     *
     * @param allowedExts      Allowed validation file extensions.
     * @param allowedMimeTypes Allowed validation file mimetypes.
     */
    public FileValidation(String[] allowedExts, String[] allowedMimeTypes) {

        initDefault();

        if (allowedExts != null) {
            this.allowedExts = allowedExts;
        }

        if (allowedMimeTypes != null) {
            this.allowedMimeTypes = allowedMimeTypes;
        }
    }

    /**
     * Constructor.
     *
     * @param customValidation Custom validation.
     */
    public FileValidation(CustomValidation customValidation) {

        initDefault();
        this.customValidation = customValidation;
    }

    /**
     * Check if file is valid. Use only the custom function if provided. Else
     * check if the file has an allowed extension and mimetype.
     *
     * @param filePath File path.
     * @param mimeType File mimetype
     * @return
     */
    public boolean check(String filePath, String mimeType) {

        if (customValidation != null) {
            return customValidation.validate(filePath, mimeType);
        }

        return ArrayUtils.contains(allowedExts, FilenameUtils.getExtension(filePath))
                && ArrayUtils.contains(allowedMimeTypes, mimeType.toLowerCase());
    }
}

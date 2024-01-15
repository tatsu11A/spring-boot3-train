package com.example.demo.core.exception;


public class AppException extends RuntimeException {

    /** ���b�Z�[�WID */
    private String messageId;
    /** �t�B�[���h */
    private String field;
    
    /**
     * �R���X�g���N�^
     * @param messageId ���b�Z�[�WID
     * @param field �t�B�[���h
     * @param cause ��O
     */
    public AppException(String messageId, String field, Throwable cause) {
        super(cause);
        this.messageId = messageId;
        this.field = field;
    }

    /**
     * �R���X�g���N�^
     * @param messageId ���b�Z�[�WID
     * @param cause ��O
     */
    public AppException(String messageId, Throwable cause) {
        super(cause);
        this.messageId = messageId;
    }

    /**
     * �R���X�g���N�^
     * @param messageId ���b�Z�[�WID
     * @param field �t�B�[���h
     */
    public AppException(String messageId, String field) {
        this.messageId = messageId;
        this.field = field;
    }

    /**
     * �R���X�g���N�^
     * @param messageId ���b�Z�[�WID
     */
    public AppException(String messageId) {
        this.messageId = messageId;
    }

    /**
     * ���b�Z�[�WID�擾
     * @return
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * �t�B�[���h�擾
     * @return
     */
    public String getField() {
        return this.field;
    }
}
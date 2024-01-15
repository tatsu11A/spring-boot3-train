package com.example.demo.core.exception;

/**
 * �V�X�e����O
 * �z��O�̃V�X�e���G���[�����m�����ꍇ�ɃX���[����B
 * ��{�I�ɋƖ������̌p���͕s�\�ŁA�V�X�e���G���[��ʂ֑J�ڂ���B
 */
public class SystemException extends RuntimeException {
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
    public SystemException(String messageId, String field, Throwable cause) {
        super(cause);
        this.messageId = messageId;
        this.field = field;
    }

    /**
     * �R���X�g���N�^
     * @param messageId ���b�Z�[�WID
     * @param cause ��O
     */
    public SystemException(String messageId, Throwable cause) {
        super(cause);
        this.messageId = messageId;
    }

    /**
     * �R���X�g���N�^
     * @param messageId ���b�Z�[�WID
     * @param field �t�B�[���h
     */
    public SystemException(String messageId, String field) {
        this.messageId = messageId;
        this.field = field;
    }

    /**
     * �R���X�g���N�^
     * @param messageId ���b�Z�[�WID
     */
    public SystemException(String messageId) {
        this.messageId = messageId;
    }

    /**
     * ���b�Z�[�WID�擾
     * @return ���b�Z�[�WID
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * �t�B�[���h�擾
     * @return �t�B�[���h
     */
    public String getField() {
        return this.field;
    }
}

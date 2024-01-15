package com.example.demo.core.handler;


import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.core.exception.SystemException;

import lombok.RequiredArgsConstructor;

/**
 * WEB��O�n���h���[
 */
@ControllerAdvice
@RequiredArgsConstructor
public class WebExceptionHandler {
    
    /** ���b�Z�[�W */
    private final MessageSource messages;
    /** ���K�[ */
    private static final Logger logger = LoggerFactory.getLogger(WebExceptionHandler.class);

    /**
     * �V�X�e����O�̏���
     * ���O�o�͂��s���A�V�X�e���G���[��ʂ֑J�ڂ���B
     * @param t �V�X�e����O
     * @return �G���[���
     */
    @ExceptionHandler(SystemException.class)
    public String handleSystemException(SystemException t) {
        logger.error(messages.getMessage(t.getMessageId(), null, Locale.getDefault()), t);
        return "error.html";
    }

    /**
     * �\�����ʗ�O�̏���
     * ���O�o�͂��s���A�V�X�e���G���[��ʂ֑J�ڂ���B
     * @param t ��O
     * @return �G���[���
     */
    @ExceptionHandler(Exception.class)
    public String handleException(Exception t) {
        logger.error(t.getMessage(), t);
        return "error.html";
    }
    
}
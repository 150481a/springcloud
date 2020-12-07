package com.xiaojun.springcloud.util;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * @author AdminXiang
 * @title: MessageUtil 语言切换工具类
 * @projectName springcloud
 * @description: TODO
 * @date 2020/11/3011:48
 * `
 */
public class MessageUtil extends ResourceBundleMessageSource {

    private static MessageSource messageSource;

    public MessageUtil(){
        super();
    }

    public static MessageSource getMessageSource() {
        return messageSource;
    }

    public static void setMessageSource(MessageSource messageSource) {
        MessageUtil.messageSource = messageSource;
    }

    public  static  String get(String pvsKey){
        try {
            return messageSource.getMessage(pvsKey, null, LocaleContextHolder.getLocale());
        } catch (Exception e) {
            return pvsKey;
        }
    }

    public static String get(String pvsKey,Object ... pvParams) {
        try {
            return messageSource.getMessage(pvsKey, pvParams, LocaleContextHolder.getLocale());
        } catch (Exception e) {
            return pvsKey;
        }
    }



}


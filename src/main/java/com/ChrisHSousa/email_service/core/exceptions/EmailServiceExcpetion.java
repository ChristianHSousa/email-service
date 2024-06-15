package com.ChrisHSousa.email_service.core.exceptions;

public class EmailServiceExcpetion extends RuntimeException{
    public EmailServiceExcpetion(String message){
        super(message);
    }

    public EmailServiceExcpetion(String message, Throwable cause){
        super(message, cause);
    }

}

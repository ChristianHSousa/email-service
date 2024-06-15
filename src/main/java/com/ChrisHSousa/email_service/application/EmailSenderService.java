package com.ChrisHSousa.email_service.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ChrisHSousa.email_service.adapters.EmailSenderGateway;
import com.ChrisHSousa.email_service.core.EmailSenderUseCase;

@Service
public class EmailSenderService implements EmailSenderUseCase{

    private final EmailSenderGateway emailSenderGateway;
    
    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to,subject,body);
    }
    
    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway){
        this.emailSenderGateway = emailSenderGateway;
    }
}

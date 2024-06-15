package com.ChrisHSousa.email_service.infra.ses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
//Access key ID,Secret access key
//AKIA5FTZANRN23KBJQFU,KfqJ5YAkssKvO0+nrYugXn9jHtajxYCbrkLlHquE

@Configuration
public class awsSesConfig {
    @Value("${AWS_ACCESS_KEY}")
    String accessKey;
    @Value("${AWS_SECRET_KEY}")
    String secretKey;
    @Value("${AWS_REGION}")
    Regions regiao;
    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService() {
       // BasicAWSCredentials aws = new BasicAWSCredentials("AKIA5FTZANRN23KBJQFU",
        //        "KfqJ5YAkssKvO0+nrYugXn9jHtajxYCbrkLlHquE");
        BasicAWSCredentials aws = new BasicAWSCredentials(accessKey,secretKey);
        return AmazonSimpleEmailServiceClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(aws))
                .withRegion(regiao).build();
    }
}

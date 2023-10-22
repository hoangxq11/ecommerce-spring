//package com.example.ecommerce.configuration;
//
//import com.amazonaws.auth.AWSCredentials;
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class AWSConfiguration {
//    @Value("${aws.access_key_id}")
//    private String accessKeyId;
//
//    @Value("${aws.secret_access_key}")
//    private String secretAccessKey;
//
//    @Value("${aws.s3.region}")
//    private String region;
//
//    @Bean
//    public AmazonS3 s3() {
//        AWSCredentials awsCredentials =
//                new BasicAWSCredentials(accessKeyId, secretAccessKey);
//        return AmazonS3ClientBuilder
//                .standard()
//                .withRegion("ap-southeast-1")
//                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
//                .build();
//
//    }
//}

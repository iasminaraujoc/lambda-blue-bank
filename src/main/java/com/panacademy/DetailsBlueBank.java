package com.panacademy;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class DetailsBlueBank implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String s, Context context) {
        String saida = "Ferramentas utilizadas pela aplicação: " +
                "Swagger, Sonar, Mysql, 4Devs, JUnit, Lombok, SpringSecurity, Docker, JPA, " +
                "AWS SNS, Elastic Beanstalk, EC2, API Gateway, S3, Lambda, AWS CodeCommit, AWS CodePipeline, RDS " +
                "e Heroku";
        return saida;
    }
}

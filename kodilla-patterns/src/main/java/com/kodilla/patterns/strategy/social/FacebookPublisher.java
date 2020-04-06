package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        String message = "Facebook";
        System.out.println(message);
        return message;
    }
}

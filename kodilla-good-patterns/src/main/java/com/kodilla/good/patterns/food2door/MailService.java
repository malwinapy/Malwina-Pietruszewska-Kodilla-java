package com.kodilla.good.patterns.food2door;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("thank you for your order");
    }
}
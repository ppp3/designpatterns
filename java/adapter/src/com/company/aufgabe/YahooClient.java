package com.company.aufgabe;

public class YahooClient implements EmailProvider{

    @Override
    public void downloadEmails() {
        System.out.println("Alles von Yahoo runtergeladen");
    }
}

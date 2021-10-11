package com.company.aufgabe.Gmail;

import com.company.aufgabe.EmailProvider;
import com.company.aufgabe.Gmail.GmailClient;

public class AdapterGmail implements EmailProvider {
    private GmailClient client= new GmailClient();


    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}

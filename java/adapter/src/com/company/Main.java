package com.company;

import com.company.aufgabe.EmailClient;
import com.company.aufgabe.Gmail.AdapterGmail;
import com.company.aufgabe.Gmail.GmailClient;
import com.company.aufgabe.YahooClient;
import com.company.avaFilters.CaramalFilter;
import com.company.avaFilters.Caramel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramalFilter(new Caramel()));

        var mailClient=new EmailClient();
        mailClient.addProvider(new YahooClient());
        mailClient.addProvider(new AdapterGmail());
        mailClient.downloadEmails();
    }
}

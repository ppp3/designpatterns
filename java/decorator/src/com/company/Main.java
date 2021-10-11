package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var cloudstream =new CloudStream();
        cloudstream.write("Hallo");

        var cloudstream2 =new EncryptedCloudStream();
        cloudstream2.write("dsfsd");
    }
}

package com.company;

import aufgabe.AESEncrypter;
import aufgabe.ChatClient;
import aufgabe.DESEncrypter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var imageStorage=new ImageStorage();
        imageStorage.store("a", new JpgCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());

        var chatClient=new ChatClient(new AESEncrypter());
        chatClient.send("Nachricht1", );

        chatClient=new ChatClient(new DESEncrypter()());
        chatClient.send("Nachricht2" );
    }
}

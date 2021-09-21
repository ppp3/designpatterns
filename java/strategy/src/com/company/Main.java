package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var imageStorage=new ImageStorage();
        imageStorage.store("a", new JpgCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());
    }
}

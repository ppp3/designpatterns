package com.company;

public class JpgCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using Jpg");
    }
}

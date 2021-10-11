package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
    }
}

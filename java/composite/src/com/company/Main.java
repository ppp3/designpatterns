package com.company;

import com.company.aufgabe.Demo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var group1=new Group();
        group1.add(new Shape()); //square
        group1.add(new Shape()); //square

        var group2=new Group();
        group2.add(new Shape()); //circle
        group2.add(new Shape()); //circle

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();

        group.move();

        Demo demo=new Demo();
        demo.show();
    }
}

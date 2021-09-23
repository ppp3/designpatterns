package com.company.aufgabe;

public class Window extends WindowsTask{

    @Override
    protected void before()
    {
        System.out.println("Before");
    }

    @Override
    protected void after()
    {
        System.out.println("After");
    }


}

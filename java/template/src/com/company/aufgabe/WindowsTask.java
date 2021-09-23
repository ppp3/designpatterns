package com.company.aufgabe;

public abstract class WindowsTask {

    protected void before()
    {

    }

    protected void after()
    {

    }


    public void close()
    {
        before();
        System.out.println("Close the window");
        after();
    }


}

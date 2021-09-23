package com.company;

import com.company.aufgabe.Window;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Task task=new TransferMoneyTask();
        task.execute();

        task=new GenerateReportTask();
        task.execute();

        var w=new Window();
        w.close();
    }
}

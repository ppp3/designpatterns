package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Task task=new TransferMoneyTask();
        task.execute();

        task=new GenerateReportTask();
        task.execute();

    }
}

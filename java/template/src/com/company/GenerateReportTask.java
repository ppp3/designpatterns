package com.company;

public class GenerateReportTask {
    private AuditTrail auditTrail;

    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    void execute()
    {
        auditTrail.record();
        System.out.println("Generate Report");
    }
}

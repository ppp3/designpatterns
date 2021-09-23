package com.company;

public class TransferMoneyTask {
    private AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    void execute()
    {
        auditTrail.record();
        System.out.println("Transfer money");
    }
}
}

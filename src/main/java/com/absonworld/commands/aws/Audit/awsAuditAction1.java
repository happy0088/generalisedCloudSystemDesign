package com.absonworld.commands.aws.Audit;


import com.absonworld.commands.ICommand;

public class awsAuditAction1 implements ICommand {


    @Override
    public String execute(String[] args) {
        System.out.println("AWS - Audit - auditAction1 fired..");
        return null;
    }
}

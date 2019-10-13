package com.absonworld.commands.aws.Security;

import com.absonworld.commands.ICommand;

public class awsSecurityAction1 implements ICommand {


    @Override
    public String execute(String[] args) {
        System.out.println("AWS - Securiy - securityAction1 fired..");
        return null;
    }
}

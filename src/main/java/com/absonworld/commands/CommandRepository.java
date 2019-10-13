package com.absonworld.commands;

import com.absonworld.commands.aws.Audit.awsAuditAction1;
import com.absonworld.commands.aws.Audit.awsAuditAction2;
import com.absonworld.commands.aws.Security.awsSecurityAction1;
import com.absonworld.commands.aws.Security.awsSecurityAction2;
import com.absonworld.commands.azure.Security.azureScurityAction1;

import java.util.HashMap;
import java.util.Map;

public class CommandRepository {

    public static ICommand auditActionA = new awsAuditAction1();
    public static ICommand auditActionB = new awsAuditAction2();
    public static ICommand securityActionA = new awsSecurityAction1();
    public static ICommand securityActionB = new awsSecurityAction2();

    public static ICommand azureSecurityActionA = new azureScurityAction1();
    public static ICommand azureSecurityActionB = new azureScurityAction1();

    public static Map<String, ICommand> awsCommandMap = new HashMap();
    public static Map<String, ICommand> azureCommandMap = new HashMap();

    static {
        awsCommandMap.put("auditActionA", auditActionA);
        awsCommandMap.put("auditActionB", auditActionB);
        awsCommandMap.put("securityActionA", securityActionA);
        awsCommandMap.put("securityActionB", securityActionB);

        azureCommandMap.put("securityActionA", azureSecurityActionA);
        azureCommandMap.put("securityActionB", azureSecurityActionB);

    }

}

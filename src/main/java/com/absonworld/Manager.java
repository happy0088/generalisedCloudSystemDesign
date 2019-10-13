package com.absonworld;

import com.absonworld.cloud.CloudFactory;
import com.absonworld.cloud.ICloud;
import com.absonworld.service.CloudService;

import java.util.*;

public class Manager {


    public static void main(String args[]) {
        CloudService service = new CloudService();

        ICloud cloud;
        User user = new User("abs", "pass");
        List<String> serviceProviderList = new ArrayList<String>(
                Arrays.asList("AWS", "AZURE"));

        Map<String, List> categoryMap = new HashMap() {{
            put("AWS", new ArrayList<String>(
                    Arrays.asList("Security", "Audit")));
            put("AZURE", new ArrayList<String>(
                    Arrays.asList("Security")));
        }};

        Map<String, List<String>> actionMap = new HashMap() {{
            put("Security", new ArrayList<String>(
                    Arrays.asList("securityActionA", "securityActionB")));
            put("Audit", new ArrayList<String>(
                    Arrays.asList("auditActionA", "auditActionB")));
        }};

        System.out.println("Manager Activated .....");


        for (String serviceProvider : serviceProviderList) {

            System.out.println(serviceProvider + "....");
            cloud = CloudFactory.cloudMap.get(serviceProvider);
            cloud=cloud.getInstance(user);
            service.doService(cloud, categoryMap.get(serviceProvider), actionMap);

        }


    }
}

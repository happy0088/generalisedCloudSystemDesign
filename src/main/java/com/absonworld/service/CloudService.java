package com.absonworld.service;

import com.absonworld.User;
import com.absonworld.cloud.ICloud;
import com.absonworld.commands.CommandController;

import java.util.List;
import java.util.Map;

public class CloudService {

    public void doService(ICloud cloud, List<String> categoryList, Map<String, List<String>> actionMap) {

        categoryList.forEach(category -> {
            System.out.println("  " + category + "....");
            actionMap.get(category).forEach(action -> {
                System.out.println("    " + action + "....");
                CommandController controller = new CommandController();
                controller.setCommand(cloud.getCommandRepository().get(action));
                controller.fireCommand(new String[]{("Execute")});
            });
        });

    }

}

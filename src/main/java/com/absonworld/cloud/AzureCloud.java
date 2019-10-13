package com.absonworld.cloud;

import com.absonworld.User;
import com.absonworld.commands.CommandRepository;
import com.absonworld.commands.ICommand;

import java.util.HashMap;
import java.util.Map;

public class AzureCloud implements ICloud {
    public static final AzureCloud BASE_INSTANCE = new AzureCloud();
    private static Map<String, ICommand> commandRepository = new HashMap();

    private AzureCloud() {
    }

    @Override
    public ICloud getInstance(User user, String url) {
        setCommandRepository(CommandRepository.azureCommandMap);
        return new AzureCloud();
    }

    @Override
    public Map getCommandRepository() {
        return commandRepository;
    }

    public static void setCommandRepository(Map commandRepository) {
        AzureCloud.commandRepository = commandRepository;
    }
}

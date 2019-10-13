package com.absonworld.cloud;

import com.absonworld.User;
import com.absonworld.commands.CommandRepository;
import com.absonworld.commands.ICommand;

import java.util.HashMap;
import java.util.Map;

public class AWSCloud implements ICloud {

    public static final AWSCloud BASE_INSTANCE = new AWSCloud();
    private static Map<String, ICommand> commandRepository = new HashMap();

    private AWSCloud(){

    };

    @Override
    public ICloud getInstance(User user,String url) {
        setCommandRepository(CommandRepository.awsCommandMap);
        return new AWSCloud();
    }

    @Override
    public Map getCommandRepository() {
        return commandRepository;
    }
    public static AWSCloud getBaseInstance() {
        return BASE_INSTANCE;
    }

    public static void setCommandRepository(Map commandRepository) {
        AWSCloud.commandRepository = commandRepository;
    }

}

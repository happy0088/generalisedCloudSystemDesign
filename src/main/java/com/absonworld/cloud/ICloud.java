package com.absonworld.cloud;

import com.absonworld.User;
import com.absonworld.commands.ICommand;

import java.util.Map;

public interface ICloud {

     ICloud getInstance(User user,String url);
     Map<String, ICommand> getCommandRepository();
}

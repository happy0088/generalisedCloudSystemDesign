package com.absonworld.commands;

public class CommandController {


    private ICommand icommand;

    public ICommand setCommand(ICommand icommand){
        this.icommand = icommand;
        return icommand;
    }
    public String  fireCommand(String[] args) {
        return icommand.execute(args);
    }
}

package com.kado.useralert.model;

import java.util.List;

public class Commands {

    private Integer commandId ;
    private String commandName ;
    private String commandOwner ;
    private String processType ;
    private List<Integer> dayOfWeek ;
    private String chaseGroupId;
    private Integer chaseTime ;

    public Commands() {
    }

    public Integer getCommandId() {
        return commandId;
    }

    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandOwner() {
        return commandOwner;
    }

    public void setCommandOwner(String commandOwner) {
        this.commandOwner = commandOwner;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public List<Integer> getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(List<Integer> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getChaseGroupId() {
        return chaseGroupId;
    }

    public void setChaseGroupId(String chaseGroupId) {
        this.chaseGroupId = chaseGroupId;
    }

    public Integer getChaseTime() {
        return chaseTime;
    }

    public void setChaseTime(Integer chaseTime) {
        this.chaseTime = chaseTime;
    }
}

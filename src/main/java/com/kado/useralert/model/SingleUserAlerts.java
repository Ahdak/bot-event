package com.kado.useralert.model;

/**
 * Les users souhaitant etre notifie par rapport a leur commande
 *
 * @author ahmeddammak
 */
public class SingleUserAlerts {

    private String seasameId ;
    private String chaseGroupId ;
    private Integer chaseTime ;

    public String getSeasameId() {
        return seasameId;
    }

    public void setSeasameId(String seasameId) {
        this.seasameId = seasameId;
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

    public SingleUserAlerts() {
    }
}

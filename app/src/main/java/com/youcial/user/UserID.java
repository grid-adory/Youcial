package com.youcial.user;

/**
 * Created by GyanPrakash on 10/14/2016.
 */

public class UserID {
    private String uniqueId;
    private int idType;
    private boolean verifyStatus;

    //setters
    public void set_uniqueId(String id){ this.uniqueId=id; }
    public void set_idType(int type){ this.idType=type;  }
    public void set_verifyStatus(boolean status){ this.verifyStatus=status; }
    //getters
    public String get_uniqueId(){  return this.uniqueId; }
    public int get_idType(){ return this.idType; }
    public boolean isVerified(){  return this.verifyStatus; }
}

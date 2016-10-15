package com.youcial.user;

/**
 * Created by GyanPrakash on 10/14/2016.
 */

public class User {
    private UserID id;
    private String name;
    private int age;
    private char sex;
    private String dp_url;
    private int likes;
    private String bio;
    private String address;

    //setters
    public void set_id(String _id,int _type,boolean _status){
        this.id.set_uniqueId(_id);
        this.id.set_idType(_type);
        this.id.set_verifyStatus(_status);
    }
    public void set_name(String _name){ this.name = _name;}
    public void set_age(int _age){  this.age = _age; }
    public void set_sex(char _sex){  this.sex=_sex; }
    public void set_dp_url(String url){  this.dp_url = url; }
    public void set_likes(int _likes){  this.likes = _likes; }
    public void set_bio(String _bio){  this.bio = _bio; }
    public void set_address(String _add){ this.address = _add; }
    //getters
    public UserID get_id(){  return this.id;  }
    public String get_name(){  return this.name; }
    public int get_age(){  return this.age; }
    public char get_sex(){  return this.sex;  }
    public String get_dp_url(){  return this.dp_url; }
    public int get_likes(){ return this.likes; }
    public String get_bio(){ return this.bio; }
    public String get_address(){ return this.address;  }

}

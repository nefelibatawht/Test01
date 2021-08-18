package com.nefelibata.test01.entity;

public class User {
    public String username;
    public int password;
    public String phone;

    public User(){

    }
    public User(String username, int password, String phone) {
            this.username = username;
            this.password = password;
            this.phone = phone;
        }

        public String getName(){
            return  username;
        }
        public void setName(String username){
            this.username = username;
        }
        public int getPassword(){
            return  password;
        }
        public void setPassword(int password){
            this.password = password;
        }
        public String getPhone(){
            return phone;
        }
        public void setPhone(String phone){
            this.phone= phone;
        }
    }

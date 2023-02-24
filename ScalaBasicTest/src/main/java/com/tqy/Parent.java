package com.tqy;

public class Parent {

    protected String name = "Parent";
    public Parent(){
        System.out.println("Parent.....");
    }

   public class child{
        public child(){
            System.out.println("Parent name:"+name+".....");
            System.out.println("child.....");
        }
    }
}

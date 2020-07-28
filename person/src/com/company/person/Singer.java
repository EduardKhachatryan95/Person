package com.company.person;

public class Singer extends Person {

    public Singer(String name, String designation) {
        this.name = name;
        this.designation = designation;
        System.out.println("I'm a Singer  my name is "+this.name);

    }

    public void singing(){
        System.out.println("singing");
    }

    public void playGuitar(){
        System.out.println("playGuitar");
    }


}

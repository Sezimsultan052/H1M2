package com.company;

public class GrandDad {
    private String name;
    private BirthDate birthDate;
    private HobbyEnum hobby;

    public GrandDad(String name, BirthDate birthDate, HobbyEnum hobby) {
        this.name = name;
        this.birthDate = birthDate;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public HobbyEnum getHobby() {
        return hobby;
    }

    public String getInfo(){
        return "Name = "+ name +
                " \nBirthdate= "+ birthDate.getDay()+"." +birthDate.getMonth()+"."+birthDate.getYear()+
                " \nHobby = " + hobby;
    }
}

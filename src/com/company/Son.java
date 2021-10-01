package com.company;

import java.util.BitSet;

public final class Son extends Dad{
    private String currentEducation;

    public Son(String name, BirthDate birthDate, HobbyEnum hobby, String work, String currentEducation) {
        super(name, birthDate, hobby, work);
        this.currentEducation = currentEducation;
    }

    public String getCurrentEducation() {
        return currentEducation;
    }


    @Override
    public void SayHello() {
        super.SayHello();
        System.out.println("Hello say son");
    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nCurrent education= " + currentEducation;
    }
}

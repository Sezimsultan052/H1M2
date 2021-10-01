package com.company;

public class Dad extends GrandDad{
    private String work;

    public Dad(String name, BirthDate birthDate, HobbyEnum hobby, String work) {
        super(name, birthDate, hobby);
        this.work = work;

    }

    public String getWork() {
        return work;
    }


    public void SayHello(){

        System.out.println("Hello!!!");

    }

    public final void SayHello(int count) {

        for (int i = 0; i < count; i++) {

            System.out.println("Hello");
        }

    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nWork= "+ getWork();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        BirthDate birthDate = new BirthDate(12,12,1977);
        BirthDate birthDateSon1 = new BirthDate(12,12,1999);
        BirthDate birthDateSon2 = new BirthDate(12,12,2000);

        Dad dad = new Dad("Ivan", birthDate,HobbyEnum.SING,"Composer");
	    dad.SayHello();
	    Son son1 = new Son("Peter",birthDateSon1,HobbyEnum.LITERATURE,"no work", "Student" );
	    son1.SayHello();
	    Son son2 = new Son("Sergey ",birthDateSon1,HobbyEnum.LITERATURE,"no work", "Student");
        son2.SayHello();

        System.out.println(dad.getInfo());
        System.out.println("----------------------");
        System.out.println(son1.getInfo());
        System.out.println("----------------------");
        System.out.println(son2.getInfo());


    }
}

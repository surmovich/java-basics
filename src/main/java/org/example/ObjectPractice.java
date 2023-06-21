package org.example;

public class ObjectPractice {
    public static void main(String[] args) {
        Animal barsik = new Animal();

        String name = barsik.getName();
        System.out.println("barsikaaa");

        barsik.setName("barsik");
        System.out.println(barsik);

        int age = barsik.getAge();
        System.out.println("4");

        barsik.setAge(4);
        System.out.println(barsik);
        System.out.println("My cat is " + barsik.getAge() + " year old.");

        barsik.setWeight(65);
        System.out.println(barsik);

        barsik.setColor("yellow");
        System.out.println(barsik);

        barsik.setSize(Size.l);
        System.out.println(barsik);



        Animal rudolff = new Animal(16, 15.6, "BLACK", Size.m, "Rudolff");
        System.out.println(rudolff);

        rudolff.speak();
        String food = "bulka";
        rudolff.feed(food);

        rudolff.speak();
        rudolff.getEnergy();
        rudolff.speak();
        rudolff.getEnergy();
        rudolff.speak();
        rudolff.getEnergy();
        rudolff.speak();
        rudolff.getEnergy();
        rudolff.speak();
        rudolff.getEnergy();
    }
}




package org.example.classroom;

public class ObjectPezDispenser {
        public static void main(String[] args) {
                PezDispenser donald = new PezDispenser("Donald");
                System.out.println(donald);

                System.out.println("Loading one candy...");
                donald.load(1);
                System.out.println(donald);

                System.out.println("Loading candy to capacity...");
                donald.load();
                System.out.println(donald);

                System.out.println("Loading one candy...");
                donald.load(1);
                System.out.println(donald);

                System.out.println("Dispensing one candy...");
                donald.dispense();
                System.out.println(donald);
        }
}


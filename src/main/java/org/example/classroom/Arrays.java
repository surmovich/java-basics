package org.example.classroom;

public class Arrays {
    public static void main(String[] args) {

        int angle = 200;

        if (angle > 0 && angle < 90) {
            System.out.println("acute ang.");
        } else if (angle == 90) {
            System.out.println("right ang.");
        } else if (angle > 90 && angle < 180) {
            System.out.println("obtuse ang.");
        } else if (angle == 180) {
            System.out.println("straight");
        } else {
            System.out.println("provided angle is not supported");
        }
    }
}





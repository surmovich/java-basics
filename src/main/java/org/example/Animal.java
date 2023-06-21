package org.example;

public class Animal {
    public static void main(String[] args) {
    }

    private int age;
    private double weight;
    private String color;
    private Enum size;
    private String name;
    private boolean isMammal;
    private int energy = 4;

    public int getEnergy(){
        System.out.println("Currents energy " + energy);
        return energy;

        }


    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Enum getSize() {
        return size;
    }

    public void setSize(Enum size) {
        this.size = size;
    }
    public void speak(){
        if (energy <= 0) {
            System.out.println("I dont have energy");
            getEnergy();
        } else {
            System.out.println("I am speaking with you");
            energy--;
        }
    }
        public void feed (String foodName){
        System.out.println("I am eating " + foodName);
        energy++;

    }

    public Animal(int age, double weight, String color, Enum size, String name) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", isMammal=" + isMammal +
                '}';
    }
}




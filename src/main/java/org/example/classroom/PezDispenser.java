package org.example.classroom;

public class PezDispenser {
    public static void main(String[] args) {
    }
        public int currentAmtCandy;
        public int capacity;
        public String name;

        // constructor
        // name - the name of the pez dispenser
    public PezDispenser(String name) {
            this.name = name;
            capacity = 10;
        }

        // getter for the name of the pez dispenser
        public String getName() {
        return name; }

        // getter for the amount of candy in the pez dispenser
        public int getCurrentAmtCandy() {
        return currentAmtCandy;
        }

        public void setCurrentAmtCandy(int currentAmtCandy) {
        this.currentAmtCandy = currentAmtCandy;
        }
        public int getCapacity() {
        return capacity;
        }
    // completely load the Pez dispenser
        public void load() {
            this.currentAmtCandy = this.capacity;
        }

        // load n new candies into the pez dispenser
        // returns a boolean whether or not the amount was added to the pez dispenser
        public boolean load(int n) {
            if (n >= 1 && currentAmtCandy + n <= capacity) {
                currentAmtCandy += n;
                return true;
            }
            return false;
        }

        // dispense one candy
        // returns a boolean whether or not one candy was dispensed
        public boolean dispense() {
            if (currentAmtCandy > 0) {
                currentAmtCandy--;
                return true;
            }
            return false;
        }

        // Returns a string representing the pez dispenser
        public String toString() {
            return "Pez Dispenser " + name + " contains " + currentAmtCandy + " candies";
        }
    }

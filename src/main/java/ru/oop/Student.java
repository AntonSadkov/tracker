package ru.oop;

public class Student {
    private void music() {
        System.out.println("Tra tra tra");
    }

    private void sing() {
        System.out.println("I believe, I can fly!");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.sing();
        petya.music();
        petya.sing();
        petya.music();
        petya.sing();
    }
}

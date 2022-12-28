package ru.mirea.task13.ex2;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Ledyaykin", "", "");
        Person p2 = new Person("Ledyaykin", "Artyom", "Vitalevich");
        Person p3 = new Person("Ledyaykin", "Artyom", "");
        System.out.println("1: " + p1.FIO() + " 2: " + p2.FIO() + " 3: " + p3.FIO());
    }
}

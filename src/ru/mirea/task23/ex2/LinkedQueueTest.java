package ru.mirea.task23.ex2;

import java.util.Scanner;

public class LinkedQueueTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой размер очереди?");
        LinkedQueue queue1 = new LinkedQueue(scanner.nextInt());
        int menu = 1;
        while (menu != 0)
        {
            System.out.print("1 - add, 2- pop, 3 - clear, 4 - top: ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> {
                    System.out.print("\nВведите значение: ");
                    queue1.add(scanner.nextInt());
                }
                case 2 -> System.out.println("Удалили значение - " + queue1.pop());
                case 3 -> queue1.clear();
                case 4 -> System.out.println("Верхнее значение - " + queue1.element());
            }
            queue1.printQ();
        }
    }
}

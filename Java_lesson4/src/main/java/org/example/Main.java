package org.example;

import java.util.LinkedList;
import java.util.Scanner;

import static org.example.Task1.reverse;
import static org.example.Task2.checkIsSequence;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>(); //создаем лист
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) { //в цикле запрашиваем числа, размер взял как в примере что бы не выдумывать
            Integer var = sc.nextInt(); //вводим числа через консоль
            link.add(var);
        }
        System.out.println(link); // выводим лист в консоль
        reverse(link); //переворачиваем лист, сделал через итераторы для интереса, в задании нет конкретики

        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine(); //вводим строку в консоли
        System.out.println(checkIsSequence(str)); //проверяем скобочную последовательность возвращаем true or false
    }
}
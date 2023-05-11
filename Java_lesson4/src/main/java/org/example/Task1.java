package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Task1 {
    static void reverse(LinkedList<Integer> list){
        ListIterator<Integer> it = list.listIterator(list.size());
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}

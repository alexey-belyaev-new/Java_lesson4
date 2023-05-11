package org.example;

public class Task2 {
    static boolean checkIsSequence(String str){
        char[] chars = str.toCharArray();
        int size = chars.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(chars[i] == '[' | chars[i] == '{' | chars[i] == '(') count++;
            else if (chars[i] == ']' | chars[i] == '}' | chars[i] == ')') count--;
        }
        if(count != 0) return false;
        else return true;
    }
}

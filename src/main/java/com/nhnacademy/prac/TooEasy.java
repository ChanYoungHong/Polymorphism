package com.nhnacademy.prac;

public class TooEasy {

    public static int addForm1to10() {
        int sum = 0;
        int index;
        for (index = 1; index <= 10; index++) {
            sum += index++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addForm1to10());
    }

}

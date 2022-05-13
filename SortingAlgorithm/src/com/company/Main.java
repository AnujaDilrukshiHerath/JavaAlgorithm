package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(9);
        numbers.add(2);
        numbers.add(23);
        numbers.add(19);
        System.out.println("unsorted ArrayList :" + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted ArrayList : " + numbers);
    }

}

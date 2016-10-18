package com.ironyard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Tom on 10/18/16.
 */
public class Kata {
    public static boolean firstLastSix(ArrayList<Integer> x) {
        if (x.get(0) == 6 || x.get(x.size() - 1) == 6) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean sameFirstLast(ArrayList<Integer> x) {
        if (x.get(0) == 1 && x.get(0) == x.get(x.size() - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void rotateLeft(ArrayList<Integer> x) {
        int g = x.remove(0);
        x.add(2, g);
        System.out.println("Kata.sameFirstLast(" + x + ")");

    }

    public static void reverse3(ArrayList<Integer> reverseOne) {

        Collections.reverse(reverseOne);

        System.out.println("Kata.reverse3(" + reverseOne + ")");
    }

    public static void Penultimate(ArrayList<Integer> ultimateOne) {
        if (ultimateOne.size() >= 2) {

        } else if (ultimateOne.size() == 2) {
            int x = ultimateOne.get(1);
            int y = ultimateOne.get(ultimateOne.size()-2);
            int z = x + y;

        }

    }
}


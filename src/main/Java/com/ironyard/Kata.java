package com.ironyard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

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

    }

    public static void reverse3(ArrayList<Integer> reverseOne) {
        Object z = reverseOne.clone();
        Collections.reverse(reverseOne);

        System.out.println("Kata.reverse3)" + z+" -> " + reverseOne + ")");
    }

    public static void penultimate(ArrayList<Integer> ultimateOne) {
        if (ultimateOne.size() <  1) {
            System.out.println("Kata.Penultimate)"+ ultimateOne+" -> (0)");
        }
        else if (ultimateOne.size()<2){
            Object original = ultimateOne.clone();
            System.out.println("Kata.Penultimate)" + original + " -> (" + ultimateOne.size() + ")");

        }
        else if (ultimateOne.size() >= 2) {
            Object original = ultimateOne.clone();
            int x = ultimateOne.get(1);
            int y = ultimateOne.get(ultimateOne.size()-2);
            int z = x + y;
            System.out.println("Kata.Penultimate)" + original + " -> (" + z + ")");
        }
    }
    public static void mapBully(HashMap<String,String> bullyOne){

        String x = bullyOne.get("a");
        bullyOne.put("b", x);
        bullyOne.put("a", "\" \"");






    }

}



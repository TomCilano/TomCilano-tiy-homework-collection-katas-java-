package com.ironyard;

import java.util.*;

/**
 * Created by Tom on 10/18/16.
 */
public class Kata {
    /**
     * Given an ArrayList of ints, return true if 6 appears as
     * either the first or last element in the ArrayList.
     * The ArrayList will be length 1 or more.
     *
     * @param x
     * @return
     */
    public static boolean firstLastSix(ArrayList<Integer> x) {
        if (x.get(0) == 6 || x.get(x.size() - 1) == 6) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Given an ArrayList of Integers, return true if the ArrayList
     * is length 1 or more, and the first element and the last element are equal.
     *
     * @param x
     * @return
     */
    public static boolean sameFirstLast(ArrayList<Integer> x) {
        if (x.get(0) == 1 && x.get(0) == x.get(x.size() - 1)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Given an ArrayList of Integers length 3,
     * return an ArrayList with the elements "rotated left"
     * so [1, 2, 3] yields [2, 3, 1].
     *
     * @param x
     */
    public static void rotateLeft(ArrayList<Integer> x) {
        int g = x.remove(0);
        x.add(2, g);

    }

    /**
     * Given an ArrayList of Integers length 3, return a new ArrayList with
     * the elements in reverse order, so [1, 2, 3] becomes [3, 2, 1].
     *
     * @param reverseOne
     */
    public static void reverse3(ArrayList<Integer> reverseOne) {
        Object z = reverseOne.clone();
        Collections.reverse(reverseOne);

        System.out.println("Kata.reverse3)" + z + " -> " + reverseOne + ")");
    }

    /**
     * Given an ArrayList of Integers of at least length 2, return the sum of the first elements
     * in the ArrayList and the second from last element. If the ArrayList length is less than 2,
     * just sum up the elements that exist, returning 0 if the array is length 0.
     *
     * @param ultimateOne
     */
    public static void penultimate(ArrayList<Integer> ultimateOne) {
        if (ultimateOne.size() < 1) {
            System.out.println("Kata.Penultimate)" + ultimateOne + " -> (0)");
        } else if (ultimateOne.size() < 2) {
            Object original = ultimateOne.clone();
            System.out.println("Kata.Penultimate)" + original + " -> (" + ultimateOne.size() + ")");

        } else if (ultimateOne.size() >= 2) {
            Object original = ultimateOne.clone();
            int x = ultimateOne.get(1);
            int y = ultimateOne.get(ultimateOne.size() - 2);
            int z = x + y;
            System.out.println("Kata.Penultimate)" + original + " -> (" + z + ")");
        }
    }

    /**
     * Modify and return the given HashMap as follows: if the key "a" has a value,
     * set the key "b" to have that value, and set the key "a" to have the value "".
     * Basically "b" is a bully, taking the value of "a".
     *
     * @param bullyOne
     */
    public static void mapBully(HashMap<String, String> bullyOne) {

        String x = bullyOne.get("a");
        bullyOne.put("b", x);
        bullyOne.put("a", "\" \"");
    }

    /**
     * Modify and return the given HashMap as follows: if the key "a" has a value,
     * set the key "b" to have that same value. In all cases remove the key "c",
     * leaving the rest of the map unchanged.
     *
     * @param shareOne
     */
    public static void mapShare(HashMap<String, String> shareOne) {
        if (shareOne.containsKey("a")) {
            String x = shareOne.get("a");
            shareOne.put("b", x);
            shareOne.remove("c");
        } else {
            shareOne.remove("c");

        }
    }

    /**
     * Modify and return the given HashMap as follows: for this problem
     * the HashMap may or may not contain the "a" and "b" keys. If both keys are present,
     * append their 2 string values together and store the result under the key "ab".
     *
     * @param abOne
     */
    public static void mapAB(HashMap<String, String> abOne) {

        if (abOne.containsKey("a") && abOne.containsKey("b")) {
            String x = abOne.get("a") + abOne.get("b");
            abOne.put("ab", x);
        } else {

        }
    }

    /**
     * Given an ArrayList of strings, return a HashMap containing a key
     * for every different string in the ArrayList, and the value
     * is that string's length.
     * wordLen(["a", "bb", "a", "bb"]) -> {"a": 1, "bb": 2}
     *
     * @param aWordLen
     */
    public static HashMap<String, Integer> myLen(ArrayList<String> aWordLen) {
        HashMap<String, Integer> data = new HashMap<>();

        Iterator<String> iterator = aWordLen.iterator();
        while (iterator.hasNext()) {
            String x = iterator.next();
            data.put(x, x.length());
        }
        return data;
    }

    /**
     * Given an ArrayList of words, return a HashMap> containing a keys for every word's
     * first letter. The value for the key will be an ArrayList of all words in the list
     * that start with that letter. An empty string has no first letter so don't
     * add a key for it.
     *
     * @param anIndex
     * @return
     */
    public static HashMap<String, String> myIndex(ArrayList<String> anIndex) {
        HashMap<String, String> indexHashMap = new HashMap<>();


        Iterator<String> iterator = anIndex.iterator();
        while (iterator.hasNext()) {
            String x = iterator.next();
            indexHashMap.put(x.substring(0,1),x);
        //ugggghhh

        }
        return indexHashMap;

    }
}


// check the hash map for a list
// if not create one
// look through the list and add things to the key it should be under.
//






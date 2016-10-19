package com.ironyard;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Tom on 10/18/16.
 */
public class Main {
    public static void main (String [] args){
        //*primitives are passed by value, objects are passed by reference*
        Flavor.title();

        System.out.println("");

        ArrayList<Integer> listOne = new ArrayList<>();
        listOne.add(6);
        listOne.add(2);
        listOne.add(6);
        boolean result = Kata.firstLastSix(listOne);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n", listOne, result);


        ArrayList<Integer> listTwo = new ArrayList<>();
        listTwo.add(6);
        listTwo.add(1);
        listTwo.add(2);
        listTwo.add(3);
        boolean result1 = Kata.firstLastSix(listTwo);

        System.out.printf("Kata.firstLastSix(%s) -> %s\n", listTwo, result1);
        ArrayList<Integer> listThree = new ArrayList<>();
        listThree.add(13);
        listThree.add(6);
        listThree.add(1);
        listThree.add(2);
        listThree.add(3);
        boolean result2 = Kata.firstLastSix(listThree);
        System.out.printf("Kata.firstLastSix(%s) -> %s\n", listThree, result2);

        System.out.println(" ");

        ArrayList<Integer> z = new ArrayList<>();
        z.add(1);
        z.add(2);
        z.add(3);

        boolean result3 = Kata.sameFirstLast(z);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", z, result3);

        ArrayList<Integer> sameOne = new ArrayList<>();
        sameOne.add(1);
        sameOne.add(2);
        sameOne.add(3);
        sameOne.add(1);
        boolean result4 = Kata.sameFirstLast(sameOne);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", sameOne, result4);

        ArrayList<Integer> sameOne2 = new ArrayList<>();
        sameOne2.add(1);
        sameOne2.add(2);
        sameOne2.add(1);

        boolean result5 = Kata.sameFirstLast(sameOne2);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", sameOne2, result5);
        System.out.println("");

        ArrayList<Integer> rotateOne = new ArrayList<>();
        rotateOne.add(1);
        rotateOne.add(2);
        rotateOne.add(3);
        Object anPreMethod = rotateOne.clone();
        Kata.rotateLeft(rotateOne);
        System.out.printf("Kata.RotateLeft3(%s) -> %s",anPreMethod, rotateOne );
        System.out.println("");


        ArrayList<Integer> rotateTwo = new ArrayList<>();
        rotateTwo.add(5);
        rotateTwo.add(11);
        rotateTwo.add(9);
        Object preMethod = rotateTwo.clone();
        Kata.rotateLeft(rotateTwo);
        System.out.printf("Kata.RotateLeft3(%s) -> %s",preMethod, rotateTwo );
        System.out.println("");


        ArrayList<Integer> rotateThree = new ArrayList<>();
        rotateThree.add(0);
        rotateThree.add(0);
        rotateThree.add(7);
        Object apreMethod =  rotateThree.clone();
        Kata.rotateLeft(rotateThree);
        System.out.printf("Kata.RotateLeft3(%s) -> %s",apreMethod, rotateThree );


        System.out.println("");
        System.out.println("");


        ArrayList<Integer> reverseOne = new ArrayList<>();
        reverseOne.add(1);
        reverseOne.add(2);
        reverseOne.add(3);
        Kata.reverse3(reverseOne);

        ArrayList<Integer> reverseTwo = new ArrayList<>();
        reverseTwo.add(5);
        reverseTwo.add(11);
        reverseTwo.add(9);
        Kata.reverse3(reverseTwo);

        ArrayList<Integer> reverseThree = new ArrayList<>();
        reverseThree.add(0);
        reverseThree.add(0);
        reverseThree.add(7);
        Kata.reverse3(reverseThree);

        System.out.println("");
        System.out.println("");

        ArrayList<Integer> ultimateOne = new ArrayList<>();
        ultimateOne.add(1);
        ultimateOne.add(1);
        ultimateOne.add(7);
        ultimateOne.add(7);
        Kata.penultimate(ultimateOne);

        ArrayList<Integer> ultimateTwo = new ArrayList<>();
        ultimateTwo.add(31);
        ultimateTwo.add(42);
        ultimateTwo.add(62);
        ultimateTwo.add(27);
        Kata.penultimate(ultimateTwo);

        ArrayList<Integer> ultimateThree = new ArrayList<>();
        ultimateThree.add(1);
        Kata.penultimate(ultimateThree);

        System.out.println("");

        Flavor.hashmap();
        System.out.println("");

        HashMap<String, String> bullyOne = new HashMap<>();
        bullyOne.put("a","Candy");
        bullyOne.put("b","Dirt");
        Object original = bullyOne.clone();
        Kata.mapBully(bullyOne);

        System.out.printf("Kata.RotateLeft3(%s) -> %s",original, bullyOne );






    }
}
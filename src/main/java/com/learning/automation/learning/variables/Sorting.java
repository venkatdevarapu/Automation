package com.learning.automation.learning.variables;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    //creating an arraylist to be sorted
    ArrayList<Integer> array = new ArrayList<Integer>();

    public void sortOne() {

        array.add(35);
        array.add(7);
        array.add(28);
        array.add(14);
        array.add(21);
        System.out.println("Original ArrayList:" +array);

        //sorting the arraylist
        Collections.sort(array);
        System.out.println("Sorted ArrayList:" +array);
    }
}

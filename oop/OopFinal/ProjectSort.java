package com.company;

/**
 * Created by replay on 2016. 6. 13..
 */
public class ProjectSort {
    private int[] data;

    public ProjectSort(int[] data) {
        this.data = data;
    }

    public int[] sort() {
        int[] i_data = data;
        int loc, newItem;
        for (int i = 1; i < i_data.length; i++) {
            loc = i;
            newItem = i_data[i];
            while (loc > 0 && newItem < i_data[loc - 1]) {
                i_data[loc] = i_data[loc - 1];
                loc--;
            }
            i_data[loc] = newItem;
        }
        return i_data;
    }
}

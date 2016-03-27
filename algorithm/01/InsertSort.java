package com.company;

/**
 * Created by replay on 2016. 3. 27..
 */
public class InsertSort {

    public int[] Isort(int[] data){
        int[] i_data = data;
        int loc , newItem;
        int count=0;

        for(int i = 1;i<i_data.length;i++){
            loc = i;
            newItem = i_data[i];
            count++;

            while (loc>0 && newItem < i_data[loc-1]){
                i_data[loc] = i_data[loc-1];
                count++;

                loc--;
                ++count;
            }
            i_data[loc] = newItem;
            ++count;

        }
        System.out.println(count);
        return i_data;
    }

}

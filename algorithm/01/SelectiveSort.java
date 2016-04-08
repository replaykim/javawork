package com.company;

/**
 * Created by replay on 2016. 3. 27..
 */
public class SelectiveSort {

    public int[] Ssort(int[] data){
        int[] s_data;
        s_data = data;
        int count = 0;
        int bignumber;
        int tmp=0;

        for(int i=99; i>0;i--){
            bignumber = s_data[i];
            count++;

            for(int j = i; j>0;j--){
                count++;
                if (bignumber<s_data[j-1]){
                    bignumber = s_data[j-1];
                    count++;

                    tmp = j-1;
                    count++;
                }
            }
            s_data[tmp] = s_data[i];
            count++;

            s_data[i]=bignumber;
            count++;
        }
        System.out.println("selective : "+count);
        return s_data;
    }
}

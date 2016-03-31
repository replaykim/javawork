package com.company;

/**
 * Created by replay on 2016. 3. 27..
 */
public class QuickSort {
    private int count;
    private boolean value;

    public QuickSort() {
        count = 0;
        value = true;
    }

    public int[] Qsort(int[] data, int start, int end){
        int[] q_data = data;
        int q;
        if (start < end){
            q=Qsort2(q_data,start,end);
            count++;
            Qsort(q_data,start,q-1);
            count++;
            Qsort(q_data,q+1,end);
            count++;

        }
        if (value == true){
            System.out.println(count);
            value = false;
        }
        return q_data;
    }


    public int Qsort2(int[] data, int start,int end){
        int[] q_data = data;
        int tmp;
        int x,i;

        x=q_data[end];
        count++;

        i=start-1;
        count++;


        for (int j = start ; j<end;j++){
            if (q_data[j]<=x){
                tmp = q_data[++i];
                count++;

                q_data[i] = q_data[j];
                count++;

                q_data[j] = tmp;
                count++;
            }

        }
        tmp = q_data[i+1];
        q_data[i+1] = q_data[end];
        q_data[end] = tmp;
        count++;

        return i+1;
    }
}

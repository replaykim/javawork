package com.company;

/**
 * Created by replay on 2016. 3. 27..
 */
public class QuickSort {
    private int count;
    public QuickSort() {
        count = 0;
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
        if (start == 0 && end ==q_data.length-1){  //재귀 함수이기때문에 첫 함수가 끝날 때 한번만 출력 되도록 한다.
            System.out.println("quick : "+count);
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
            count++;
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
        count++;
        q_data[i+1] = q_data[end];
        count++;
        q_data[end] = tmp;
        count++;

        return i+1;
    }
}

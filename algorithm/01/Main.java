package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
	// write your code here
        main.Qsort2(main.MakeArray(),0,99);
    }


    public void Ssort(int[] data){
        int[] s_data;
        s_data = data;
        int bignumber;
        int tmp=0;

        for(int i=99; i>1;i--){
            bignumber = s_data[i];
            for(int j = i; j>0;j--){
                if (bignumber<s_data[j-1]){
                    bignumber = s_data[j-1];
                    tmp = j-1;
                }
            }
            s_data[tmp] = s_data[i];
            s_data[i]=bignumber;
        }
        for (int i =0;i<100;i++){
            System.out.println(s_data[i]);
        }
    }

    public void Isort(int[] data){
        int[] i_data = data;
        int loc , newItem;

        for(int i = 1;i<i_data.length;i++){
            loc = i;
            newItem = i_data[i];

            while (loc>0 && newItem < i_data[loc-1]){
                i_data[loc] = i_data[loc-1];
                loc--;
            }
            i_data[loc] = newItem;
        }
        for (int i =0;i<100;i++){
            System.out.println(i_data[i]);
        }
    }

    public void Qsort2(int[] data,int start,int end){
        int[] q_data = data;
        int q;
        if (start < end){
            q=Qsort(q_data,start,end);
            Qsort2(q_data,start,q-1);
            Qsort2(q_data,q+1,end);
        }
        for (int i =0;i<100;i++){
            System.out.println(q_data[i]);
        }
    }

    public int Qsort(int[] data, int stand,int end){
        int[] q_data = data;
        int tmp;
        int x,i;

        x=q_data[end];
        i=stand-1;

        for (int j = stand ; j<end-1;j++){
            if (q_data[j]<=x){
                tmp = q_data[++i];
                q_data[i] = q_data[j];
                q_data[j] = tmp;
            }

        }
        tmp = q_data[i+1];
        q_data[i+1] = q_data[end];
        q_data[end] = tmp;
        return end+1;
    }


    public int[] MakeArray(){
        Random random = new Random();
        int[] data = new int[100];

        for (int i = 0; i<100;i++){
            data[i] = random.nextInt(10000);
        }
        return data;
    }

}

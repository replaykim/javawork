package com.company;

import java.util.Random;

/**
 * Created by replay on 2016. 3. 27..
 */
public class MakeArray {
    private Random random;
    private int[] data;
    public MakeArray() {
        random = new Random();
        data = new int[100];
    }

    public int[] makearray(){
        for (int i = 0; i<100;i++){
            data[i] = random.nextInt(10000);
        }
        return data;
    }
}

package com.company;

public class Main {
    QuickSort quickSort;
    InsertSort insertSort;
    SelectiveSort selectiveSort;
    PrintSort printSort;
    MakeArray makeArray;

    public Main() {
        quickSort = new QuickSort();
        insertSort = new InsertSort();
        selectiveSort = new SelectiveSort();
        printSort = new PrintSort();
        makeArray = new MakeArray();
        control();
    }

    public static void main(String[] args) {
        new Main();
    }
    public void control(){

        int[] data1 = makeArray.makearray();
        int[] data2 = new int[data1.length];
        int[] data3 = new int[data1.length];
        //배열 복제
        for (int i =0;i<data1.length;i++){
            data2[i] = data1[i];
            data3[i] = data1[i];
        }

        printSort.print(selectiveSort.Ssort(data1));

        printSort.print(insertSort.Isort(data2));

        printSort.print(quickSort.Qsort(data3,0,data3.length-1));
    }
}

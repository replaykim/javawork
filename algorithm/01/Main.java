package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }
    public void control(){
        QuickSort quickSort = new QuickSort();
        InsertSort insertSort  = new InsertSort();
        SelectiveSort selectiveSort = new SelectiveSort();
        PrintSort printSort = new PrintSort();
        MakeArray makeArray = new MakeArray();
        MakeArray makeArray1= new MakeArray();
        MakeArray makeArray2= new MakeArray();

        int[] data1 = makeArray.makearray();
        int[] data2 = makeArray1.makearray();
        int[] data3 = makeArray2.makearray();

        printSort.print(selectiveSort.Ssort(data1));

        printSort.print(insertSort.Isort(data2));

        printSort.print(quickSort.Qsort(data3,0,data3.length-1));
    }









}

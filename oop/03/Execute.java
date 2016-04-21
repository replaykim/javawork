package com.company;
/**
 * Created by replay on 2016-04-01.
 */
public class Execute {
    Input input;
    Output output;
    Summation summation;
    SearchBignumber searchBignumber;
    OddEven oddEven;
    Sort sort;

    public void excuteSummation(){
        summation = new Summation();
        summation.setNumbers(input.getNumbers());
        summation.summation();

        output.setSum(summation.getSum());
        output.printSumation();
    }

    public void excuteSearch(){
        searchBignumber = new SearchBignumber();
        searchBignumber.setNumbers(input.getNumbers());
        searchBignumber.search();

        output.setBignumber(searchBignumber.getBignumber());
        output.printBignumber();
    }

    public void excuteOddeven(){
        oddEven = new OddEven();
        oddEven.setNumbers(input.getNumbers());
        oddEven.counting();

        output.setEvennumber(oddEven.getEvennumber());
        output.setOddnumber(oddEven.getOddnumber());
        output.printoddeven();
    }

    public void excuteSort(){
        sort = new Sort();
        sort.setNumbers(input.getNumbers());
        sort.sort();

        output.setSortNumbers(sort.getNumbers());
        output.printSort();
    }
}

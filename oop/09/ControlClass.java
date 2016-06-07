package com.company;

/**
 * Created by replay on 2016. 6. 6..
 */
public class ControlClass {
    InputClass inputClass;
    static BookClass bookClass;

    public ControlClass(){
        inputClass = new InputClass();
        bookClass = new BookClass();
    }
    public static void main(String[] args) {
        new ControlClass();
    }
}

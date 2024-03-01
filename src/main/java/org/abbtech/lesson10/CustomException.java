package org.abbtech.lesson10;

public class CustomException extends ArrayIndexOutOfBoundsException{
//    private int[] array;
//    private int size;
//
//    public void MyArray(int size) {
//        this.size = size;
//        array = new int[size];
//    }



    public CustomException(String s) {
        super(s);
    }
}

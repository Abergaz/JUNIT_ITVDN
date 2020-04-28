package com.itvdn.junit.lesson2;

public class Accumulator {
    private int counter;
    public void accumulate(int counter){
        this.counter+=counter;
    }
    public int getCounter(){
        return counter;
    }
}

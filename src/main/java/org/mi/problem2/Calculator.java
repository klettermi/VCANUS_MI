package org.mi.problem2;

public class Calculator {
    private int num;

    public Calculator(int num) {
        this.num = num;
    }

    public Calculator add(int num){
        this.num += num;
        return this;
    }

    public Calculator subtract(int num){
        this.num -= num;
        return this;
    }

    public int out(){
        return this.num;
    }
}

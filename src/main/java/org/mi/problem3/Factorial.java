package org.mi.problem3;

import java.math.BigInteger;

public class Factorial {
    public int factorial(int num){
        if(num <= 1)
            return num;
        else
            return num * factorial(num-1);
    }

    public BigInteger newFactorial(int num){
        if (num < 0) {
            throw new IllegalArgumentException("음수는 계산할 수 없습니다.");
        }

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= num; i++) {
            result = result.multiply(new BigInteger(""+i));
        }

        return result;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(4));

        System.out.println(factorial.newFactorial(100000));
    }
}

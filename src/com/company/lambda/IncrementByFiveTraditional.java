package com.company.lambda;

public class IncrementByFiveTraditional implements  IncrementByFiveInterface{
    @Override
    public int incrementByFive(int n) {
        return n + 5;
    }

    public static void main(String[] args) {
        IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();
        System.out.println(incrementByFiveTraditional.incrementByFive(2));
    }

}

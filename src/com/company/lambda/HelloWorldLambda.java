package com.company.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        // implemanting sayHelloWorld Using Lambda
        HelloWorldInterface helloWorldInterface = () ->"Hello World";

        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}

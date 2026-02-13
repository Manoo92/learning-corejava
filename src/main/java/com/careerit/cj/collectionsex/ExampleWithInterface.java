package com.careerit.cj.collectionsex;


import java.util.function.BinaryOperator;
import java.util.function.Consumer;

interface  Calculator{
        int cal(int a, int b);
}

interface MathOperation{
        int perform(int a, int b, Calculator cal);
}

@FunctionalInterface
interface BinaryOperation{
        int perform(int a, int b);

        default  void show(){
                System.out.println("Default show method");
        }

        private void display(){
                System.out.println("Private display method");
        }

}

public class ExampleWithInterface {

        public static void main(String[] args) {

                MathOperation mathOperation = ( a,  b, cal) -> cal.cal(a,b );
                int res =  mathOperation.perform(30, 10, ( a,  b)-> a * b);
                System.out.println(res);

                BinaryOperation obj = (a, b) -> a * b;
                System.out.println(obj.perform(20,10));

                Consumer<String> consumer = System.out::println;
                consumer.accept("Hello");


                BinaryOperator<Integer> binaryOperator = (num1, num2) -> {
                        System.out.println("We are using BinaryOperator");
                        return num1 + num2;
                };

        }
}

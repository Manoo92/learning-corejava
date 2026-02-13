package com.careerit.cj.collectionsex;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface MathOperator {

    boolean isPrime(int num);

    default List<Integer> generatePrime(int lb, int ub) {
        List<Integer> list = new ArrayList<>();
        if(isValidInput(lb,ub)) {
            for (int i = lb; i <= ub; i++) {
                if (isPrime(i)) {
                    list.add(i);
                }
            }
        }
        return list;
    }

    default int countPrime(int lb, int ub){
        return generatePrime(lb,ub).size();
    }

    private boolean isValidInput(int lb,int ub){
        return lb < ub;
    }

    public static void printClassName(){
        IO.println(MathOperator.class.getSimpleName());
    }

    private static void showSystemInfo(){
        IO.println(System.getProperties().getProperty("os.name"));
    }

}

class MathOperatorImpl implements MathOperator {

    @Override
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}


public class MathOperatorManager {
}

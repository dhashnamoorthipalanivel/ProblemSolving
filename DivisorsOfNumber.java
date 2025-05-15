package ProblemSolving;

// Problem statement
// Given an integer ‘N’, your task is to write a program that returns all the divisors of ‘N’ in ascending order.

import java.util.*;

public class DivisorsOfNumber {

    public static List<Integer> printDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        Collections.sort(divisors);
        return divisors;
    }
}

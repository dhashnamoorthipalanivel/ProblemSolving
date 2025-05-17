package ProblemSolving;
//  Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.

// Floor value of any number is the greatest Integer which is less than or equal to that number

public class SquareRoot {

    int floorSqrt(int n) {
        // Your code here
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            return sqrt;
        }
        return sqrt;
    }
}

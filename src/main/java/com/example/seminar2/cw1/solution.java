package com.example.seminar2.cw1;


public class solution {
    public double myPow(double x, int n){
       if (n < 0)
            return 1 / x * myPow(1 / x, -(n + 1));
        if (n == 0)
            return 1;
        double half=myPow(x, n / 2);
        if (n % 2 == 0)
            return half * half;
        else
            return x * half * half;
    }
}


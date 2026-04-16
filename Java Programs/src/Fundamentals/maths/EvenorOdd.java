package Fundamentals.maths;

import java.util.SortedSet;

public class EvenorOdd {
    public static boolean isEven(int n)
    {
//        Finding the rem
        int rem = n%2;
        if(rem == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        int n = 15;
        if (isEven(n) == true)
            System.out.print("true");
        else
            System.out.print("false");
    }
}

package Fundamentals.maths;

public class Multiplication {
    public static void printTable(int n){
        for (int i= 1; i <= 40; ++i)
            System.out.println(n + " * " +i + " = " + n*i);
    }

    public static void main(String arg[]){
        int n = 5;
        printTable(n);
    }
}

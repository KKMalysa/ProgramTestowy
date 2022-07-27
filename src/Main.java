/**
 * tu takie małe testy i programiki rozgrzewkowe.
 */

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int s = 0;

        System.out.println();
        System.out.println("some operation before catching exception");
        System.out.println("----------------------------");
        System.out.println();
        try {
            int c = a / s;
            System.out.println(c);
        } catch (ArithmeticException ex){
            System.out.println("WYJĄTEK " + ex.toString() + " ZOSTAŁ WYKRYTY I OBSŁUŻONY ");
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("some operation after catching exception");

    }



}
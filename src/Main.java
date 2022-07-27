/**
 * tu takie małe testy i programiki rozgrzewkowe.
 */

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int s = 0;

        try {
            int c = a / s;
            System.out.println(c);
        } catch (java.lang.ArithmeticException ex){
            System.out.println("dzielisz przez zero");
        }

    }



}
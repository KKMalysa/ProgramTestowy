/**
 * tu takie małe testy i programiki rozgrzewkowe.
 */

public class Main {
    public static void main(String[] args) {

        try {
            ConnectWithPort.letsConnect(-1);
        } catch (PortNumberException ex) {
            System.out.println(ex.toString());
        }

        try {
            ConnectWithPort.letsConnect(99);
        } catch (PortNumberException ex) {
            System.out.println(ex.toString());
        }


    }
}
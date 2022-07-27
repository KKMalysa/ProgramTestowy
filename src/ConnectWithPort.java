public class ConnectWithPort {


    public static void letsConnect(int portNumber) throws PortNumberException {
        if (portNumber < 0) {
            throw new PortNumberException("A Try of opening por No. " + portNumber + " is it a correct number?");
        } else {
            System.out.println("Port No. " + portNumber + " has been opened");

        }
    }
}

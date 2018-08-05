package Exceptions;

public class App {
    public static void main(String[] args) {
        Security bond = null;

        try {
            bond = new Security("Bond", 2000);
        }
        catch(BondSecurityException e){
            System.out.println(e.getMessage());
        }
    }


}

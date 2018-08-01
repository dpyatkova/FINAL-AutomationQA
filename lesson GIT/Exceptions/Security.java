package Exceptions;

public class Security {

    private String name;
    private int amount;

    public Security(String name, int amount) throws BondSecurityException {
        if (amount % 1000 != 0) {
            throw new BondSecurityException(" The amount of bonds must be divisible by 1000: " + amount);
        }
        else {
            this.name = name;
            this.amount = amount;
            System.out.println("You have chosen bonds");
        }
    }
}

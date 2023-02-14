package test;

import java.util.Scanner;

public class Main {
  //  public  PocketMain pocket;

    public static void main(String[] args) {
        //Create new PocketMain object
        PocketMain pocket1 = new PocketMain(0);
        // Define Scanner object.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of money inserted into the Pocket!");
        //Use Scanner object sc to assign value to moneyInput.
        int moneyInput = sc.nextInt();

        // We use our Setter method to set a value to variable money in the PocketMain pocket1 Object.
        pocket1.setMoney(moneyInput);

        // Now we use our getMoney method inside println to print out the money value in the pocket1 object.
        System.out.println("Money in pocket: " + pocket1.getMoney());


    }

}

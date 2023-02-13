package test;


public class PocketMain {
    private int money;

    public PocketMain(int money) {
        this.money = money;
    }

    public int getMoney () {
        //We provide an if statement, any money inserted below (positive) 10 return 0 value. This is done as specified
        // in the provided Exercise part2.
        if (money <= 10) {
            return 0;
        }
        //Here we have the main part which is going to return our money value from PocketMain.
        return money;
    }

    public void setMoney(int money) {
        // We provide x < 0 and x > 3000 conditions, if the values are within specified range, the money (user input)
        // satifies our conditions and leads to the else statement where the input value is asigned to our object variable money.
        if (money < 0) {
            System.out.println("You can't insert negative amount of money, Can you? Please try again!");
        } else if (money > 3000) {
            System.out.println( "I Dont Have Enough Space for all this money!" );
        } else {
            this.money = money;

        }
    }

}

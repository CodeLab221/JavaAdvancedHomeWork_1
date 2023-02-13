package test;


public class PocketMain {
    private int money;

    public PocketMain(int money) {
        this.money = money;
    }

    public int getMoney () {
        if (money <= 10) {
            return 0;
        }
        return money;
    }

    public void setMoney(int money) {
        if (money < 0) {
            System.out.println("You can't insert negative amount of money, Can you? Please try again!");
        } else if (money > 3000) {
            System.out.println( "I Dont Have Enough Space for all this money!" );
        } else {
            this.money = money;

        }
    }

}
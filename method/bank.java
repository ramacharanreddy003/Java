public class bank {
    public static int currentbal = 2000;

    public static void greetcustomer() {
        System.out.println("Hello, Welcome to the banking application");
    }

    public void deposit(int amount) {
        currentbal += amount;
        System.out.println("Amount is deposited successfully.");
    }

    public static void withdrawl(int amount) {
        currentbal -= amount;
        System.out.println("Amount is withdrawn successfully.");
    }

    public static int getcurrentbalance() {
        return currentbal;
    }

    public static void main(String[] args) {
        bank bank = new bank();
        greetcustomer();

        System.out.println("Current balance is " + getcurrentbalance());
        bank.deposit(500);

        System.out.println("Current balance is " + getcurrentbalance());
        withdrawl(300);

        System.out.println("Current balance is " + getcurrentbalance());
        withdrawl(200);

        System.out.println("Current balance is " + getcurrentbalance());
    }
}
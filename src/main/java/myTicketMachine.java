package src.main.java;


/**
 * Write a description of class myTicketMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myTicketMachine{

    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    private int childPrice;
    /**
     * Create a machine that issues tickets of the given price.
     */
    public myTicketMachine(int cost, int discount)
    {
        price = cost;
        childPrice = cost-discount;
        balance = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    public int getChildPrice(){
        return childPrice;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    public int emptyMachine(){
        int returnAmount = total;
        total = 0;
        return returnAmount;
    }
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }
    public void printChildTicket()
    {
        if(balance >= childPrice) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + childPrice + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + childPrice;
            // Reduce the balance by the price.
            balance = balance - childPrice;
        }
        else {
            System.out.println("You must insert at least: " +
                               (childPrice - balance) + " more cents.");
                    
        }
    }


    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}

package wk3;

public class Week3 {

    public static void main(String[] args) {
        EventTicketingSystem ts = new EventTicketingSystem("Lemonade Stand", 5, 200);
        ts.buyTickets(5);
        ts.refundTickets(2);
        ts.buyTickets(20);
        System.out.println(ts.getRevenueGenerated());
    }
}

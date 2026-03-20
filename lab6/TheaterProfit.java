class Theater {
    final double TICKET_PRICE      = 5.00;   
    final double FIXED_COST        = 20.00; 
    final double COST_PER_ATTENDEE = 0.50;   

    String showName;
    int attendees;

    Theater(String showName, int attendees) {
        this.showName  = showName;
        this.attendees = attendees;
    }
    double calculateIncome() {
        return attendees * TICKET_PRICE;
    }
    double calculateCost() {
        return FIXED_COST + (attendees * COST_PER_ATTENDEE);
    }
    double calculateTotalProfit() {
        return calculateIncome() - calculateCost();
    }
    void display() {
        System.out.println("------------------------------");
        System.out.println("Show          : " + showName);
        System.out.println("Attendees     : " + attendees);
        System.out.println("Ticket Price  : $" + TICKET_PRICE);
        System.out.println("Fixed Cost    : $" + FIXED_COST);
        System.out.println("Cost/Attendee : $" + COST_PER_ATTENDEE);
        System.out.println("Total Income  : $" + calculateIncome());
        System.out.println("Total Cost    : $" + calculateCost());
        double profit = calculateTotalProfit();
        if (profit > 0) {
            System.out.println("Total Profit  : $" + profit + "  (PROFIT)");
        } else if (profit < 0) {
            System.out.println("Total Profit  : $" + profit + "  (LOSS)");
        } else {
            System.out.println("Total Profit  : $" + profit + "  (BREAK EVEN)");
        }
    }
}

public class TheaterProfit {
    public static void main(String[] args) {
        Theater t1 = new Theater("The Lion King",  100);  
        System.out.println("======= Movie Theater Profit Calculator =======\n");
        t1.display();
        System.out.println();
    }
}
public class DZ2a {
    public static void main(String[] args) {
        int ticketPrice = 15865;
        int milesEarned;

        if (ticketPrice >= 20) {
            milesEarned = ticketPrice / 20;
        } else {
            milesEarned = 0;

        }

        System.out.println(" За билет стоимостью " + ticketPrice + " рублей начислено " + milesEarned + " миль. ");
    }
}


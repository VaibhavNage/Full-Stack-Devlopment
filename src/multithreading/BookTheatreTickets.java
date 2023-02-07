package multithreading;

public class BookTheatreTickets {
    static int ticketsAvailable = 100;
    static synchronized void bookTicket(int tickets){
        if(ticketsAvailable >= tickets){
            ticketsAvailable = ticketsAvailable - tickets;
            System.out.println(tickets + " are booked");
            System.out.println("Total Tickets available "+ticketsAvailable);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("No tickets available");
        }

    }
}
class TicketThread1 extends Thread{
    BookTheatreTickets b1;
    int tickets;
    TicketThread1(BookTheatreTickets b1, int tickets){
        this.b1 = b1;
        this.tickets = tickets;
    }
    @Override
    public void run() {
        b1.bookTicket(tickets);
    }
}
class TicketThread2 extends Thread{
    BookTheatreTickets b1;
    int tickets;
    TicketThread2(BookTheatreTickets b1, int tickets){
        this.b1 = b1;
        this.tickets = tickets;
    }
    @Override
    public void run() {
        b1.bookTicket(tickets);
    }
}

class BookTheatreTicketImpl{
    public static void main(String[] args) {
        BookTheatreTickets bt1 = new BookTheatreTickets();
        TicketThread1 t1 = new TicketThread1(bt1,40);//60
        TicketThread2 t2 = new TicketThread2(bt1,40);//20

        BookTheatreTickets bt2 = new BookTheatreTickets();
        TicketThread1 t3 = new TicketThread1(bt2,20);//0
        TicketThread2 t4 = new TicketThread2(bt2,40);//no tickets available
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

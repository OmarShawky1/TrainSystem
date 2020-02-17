public class Ticket {
    String customerFirstName;
    String customerLastName;
    String ticketStartingPosition;
    String ticketDestination;
    String ticketDate;
    String ticketTime;
    String trainName;
    String seatNumber;


    public Ticket(String customerFirstName, String customerLastName, String ticketStartingPosition, String ticketDestination,
                  String trainName, String ticketDate, String ticketTime, String seatNumber) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.ticketStartingPosition = ticketStartingPosition;
        this.ticketDestination = ticketDestination;
        this.ticketDate = ticketDate;
        this.ticketTime = ticketTime;
        this.trainName = trainName;
        this.seatNumber = seatNumber;
    }
}

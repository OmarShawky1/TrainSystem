public class Truck {
    int numberOfSeats = 2;

    public Truck(){
        Seat[] seats = new Seat[numberOfSeats];
        for (int i=0; i<numberOfSeats; i++){
            seats[i].setSeatNumber(i);
        }
    }
}

public class Truck {
    int numberOfSeats = 2;
    private static Seat[] seats;

    public Truck(){
        seats = new Seat[numberOfSeats];
        for (int i=0; i<numberOfSeats; i++){
            seats[i].setSeatNumber(i);
        }
    }

    public boolean checkForFreeSeatsAt(int currentPosition) {
        for (Seat seat: seats){
            if (seat.checkForFreeSeatsAt(currentPosition)){
                return true;
            }
        }
        return false;
    }
}

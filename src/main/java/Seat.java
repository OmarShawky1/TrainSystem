public class Seat {


    private int seatNumber;
    private boolean[] seatState;
    private int NUMBEROFSTATIONS = TrainSystem.getNUMBEROFSTATIONS();

    public Seat() {
        seatState = new boolean[NUMBEROFSTATIONS];
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}

public class Seat {


    private int seatNumber;
    private boolean[] seatStates;
    private int NUMBEROFSTATIONS = TrainSystem.getNUMBEROFSTATIONS();

    public Seat() {
        seatStates = new boolean[NUMBEROFSTATIONS];
        for (int i = 0; i < NUMBEROFSTATIONS; i++) {
            seatStates[i] = true;
        }
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean checkForFreeSeatsAt(int currentPosition) {
        for (boolean seatState : seatStates) {
            if (seatState) {
                return true;
            }
        }
        return false;
    }
}

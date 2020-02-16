import java.util.LinkedList;
import java.util.List;

public class Seat {


    private int seatNumber;
    private boolean[] stationsState;
    private int NUMBEROFSTATIONS = TrainSystem.getNUMBEROFSTATIONS();

    public Seat() {
        stationsState = new boolean[NUMBEROFSTATIONS];
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean[] getAllStationsState() {
        return stationsState;
    }

    public boolean getStationState(int stationNumber) {
        return stationsState[stationNumber];
    }

    public void getFreeStations(){
    }

    public void setStationsState(int start, int destination) {
        for (int i = start; i <= destination; i++) {
            stationsState[i] = true;
        }
    }

}

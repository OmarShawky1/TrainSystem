import java.time.LocalDate;
import java.time.LocalTime;

public class Trips {
    private LocalDate localDate;
    private LocalTime localTime;


    private Train[] trains;
    private final int NUMBEROFTRIPSPERDAY = 24;
    private final int NUMBEROFTRIPSPERMONTH = NUMBEROFTRIPSPERDAY * 30;
    private final int NUMBEROFTRIPSPERYEAR = NUMBEROFTRIPSPERMONTH * 12;

    public Trips(LocalDate localDate, LocalTime localTime, Train[] trains) {
        this.localDate = localDate;
        this.localTime = localTime;
        this.trains = new Train[NUMBEROFTRIPSPERYEAR];
    }

    public Train[] getTrains() {
        return trains;
    }
}

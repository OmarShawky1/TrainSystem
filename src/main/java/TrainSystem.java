public class TrainSystem {

    private static int NUMBEROFSTATIONS = 3;
    private final int NUMBEROFTRAINS = 2;
    private Train[] trains;

    public TrainSystem() {
        trains = new Train[NUMBEROFTRAINS];

        trains[0] = new Train(0, Direction.UP);
        trains[1] = new Train(0, Direction.DOWN);

    }

    public static int getNUMBEROFSTATIONS() {
        return NUMBEROFSTATIONS;
    }

}

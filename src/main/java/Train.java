public class Train {

    private int numberOfTrucks = 2;
    private int position;
    private int trainDirection;
    private static Truck[] trucks;

    public Train(int position, int direction) {
        trucks = new Truck[numberOfTrucks];
        this.position = position;
        this.trainDirection = direction;
    }

    public void move() {
        switch (trainDirection) {
            case 1:
                if (position <= TrainSystem.getNUMBEROFSTATIONS()) {
                    position++;
                } else {
                    trainDirection = -1;
                    position--;
                }
                break;
            case -1:
                if (position >= 0) {
                    position--;
                } else {
                    trainDirection = 1;
                    position++;
                }
                break;
        }
    }

    public boolean checkForFreeSeatsAt(int currentPosition) {
        for (Truck truck: trucks){
            if (truck.checkForFreeSeatsAt(currentPosition)){
                return true;
            }
        }
        return false;
    }

    public int getDirection() {
        return trainDirection;
    }
    public int getPosition(){
        return position;
    }
}

public class Train {

    private int numberOfTrucks = 2;
    private int position;
    private Direction trainDirection;

    public Train(int position, Direction direction) {
        Truck[] trucks = new Truck[numberOfTrucks];
        this.position = position;
        this.trainDirection = direction;
    }

    public void move() {
        switch (trainDirection) {
            case UP:
                position++;
                break;
            case DOWN:
                position--;
                break;
        }
    }

}

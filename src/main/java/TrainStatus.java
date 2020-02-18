public class TrainStatus {

    private int VIPCapacity;
    private int firstClassCapacity;
    private int secondClassCapacity;
    private int thirdClassCapacity;
    private int VIPPassengers = 0;
    private int firstClassPassengers = 0;
    private int secondClassPassengers = 0;
    private int thirdClassPassengers = 0;
    private boolean VIPTripEmpty = true;
    private boolean firstClassEmpty = true;
    private boolean secondClassEmpty = true;
    private boolean thirdClassEmpty = true;

    public TrainStatus(int VIPCapacity, int firstClassCapacity, int secondClassCapacity, int thirdClassCapacity) {
        this.VIPCapacity = VIPCapacity;
        this.firstClassCapacity = firstClassCapacity;
        this.secondClassCapacity = secondClassCapacity;
        this.thirdClassCapacity = thirdClassCapacity;
    }


    public void setVIPPassengers(int VIPPassenger) {
        if (VIPPassengers < VIPCapacity) {
            this.VIPPassengers += VIPPassenger;
        } else {
            VIPTripEmpty = false;
        }

    }

    public void setFirstClassPassengers(int firstClassPassenger) {
        if (firstClassPassengers < firstClassCapacity) {
            this.firstClassPassengers += firstClassPassenger;
        } else {
            firstClassEmpty = false;
        }
    }

    public void setSecondClassPassengers(int secondClassPassenger) {
        if (secondClassPassengers < secondClassCapacity) {
            this.secondClassPassengers = secondClassPassenger;
        } else {
            secondClassEmpty = false;
        }
    }

    public void setThirdClassPassengers(int thirdClassPassenger) {
        if (thirdClassPassengers < thirdClassCapacity) {
            this.thirdClassPassengers = thirdClassPassenger;
        } else {
            thirdClassEmpty = false;
        }
    }

    public boolean isVIPTripEmpty() {
        return VIPTripEmpty;
    }

    public boolean isFirstClassEmpty() {
        return firstClassEmpty;
    }

    public boolean isSecondClassEmpty() {
        return secondClassEmpty;
    }

    public boolean isThirdClassEmpty() {
        return thirdClassEmpty;
    }
}

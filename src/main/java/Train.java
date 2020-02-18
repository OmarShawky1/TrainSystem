public class Train {

    private int position;
    private int trainDirection;
    private TrainStatus[] trainStatuses;

    public Train(int position, int trainDirection) {
        this.position = position;
        this.trainDirection = trainDirection;
        this.trainStatuses = new TrainStatus[TrainSystem.getNUMBEROFSTATIONS()];
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

    public int getDirection() {
        return trainDirection;
    }

    public int getPosition() {
        return position;
    }

    public TrainStatus[] getTrainStatuses() {
        return trainStatuses;
    }

    public void setTrainStatuses(TrainStatus[] trainStatuses) {
        this.trainStatuses = trainStatuses;
    }
}

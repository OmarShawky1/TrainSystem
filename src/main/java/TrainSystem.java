import java.time.LocalDate;
import java.time.LocalTime;

public class TrainSystem {

    private static int NUMBEROFSTATIONS = 3;
    private final int NUMBEROFTRAINS = 2;
    private static Train[] trains;

    public TrainSystem() {
        trains = new Train[NUMBEROFTRAINS];

        trains[0] = new Train(0, 1);
        trains[1] = new Train(0, -1);

    }

    public static int getNUMBEROFSTATIONS() {
        return NUMBEROFSTATIONS;
    }

    public static void issueTicket(int value, int value1) {

        System.out.println("Checking if the train did not pass yet");

        System.out.println("Checking if there is an empty seat at this station & at this time");

        System.out.println("There is an empty seat");
        System.out.println("Your ticket is issued, the ticket data is name, train type, trip initial time, current position, destination");
    }


//    public static void issueTicket(int currentPosition, int destination) {
//        /*
//        * steps are as following
//        * 1)get direction
//        * 2)get the train working for this direction
//        * 3)check if the train has already passed the passenger
//        * 4)if train had not passed yet
//        *   1)check for available seats in this train
//        *       1)if there is available seats, pick a seat and write it to the ticket
//        *       2)if there is no available seats, pick the nearest possible time for passenger
//        *   2)select the othe
//        * 5)hold one seat for the passenger
//        * 6)issue the ticket*/
//
//        //1) get direction
//        int direction = destination - currentPosition;
//        direction = direction > 0 ? 1 : -1;
//
//        //2)get the train working for this direction
//        Train currentDirectionTrain = null;
//        for (Train train: trains){
//            if (train.getDirection() == direction){
//                currentDirectionTrain = train;
//            }
//        }
//
//        //3)check if the train already passed the passenger
//        boolean theCurrentDirectionTrainHasPassed = currentDirectionTrain.getPosition() == currentPosition;
//
//
//
////        Train selectedTrain;
////        for (Train train: trains){
////            if(train.checkForFreeSeatsAt(currentPosition)){
////                selectedTrain = train;
////                break;
////            }
////        }
//
//    }


}

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    List<String> tickets = new ArrayList<>();

    public static boolean issueATicket(String date, String time, String classTpe, int position, int destination) {
        String ticketName = date + " " + time + " " + classTpe + " " + position + " " + destination;
        System.out.println(ticketName);
        return true;
    }
}

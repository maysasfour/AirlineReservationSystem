import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Passenger {
    private UUID passengerID;
    private String name;
    private HashMap contactInfo;
    private ArrayList travelDocuments;

    public Passenger(){

    }

    public Passenger(UUID passengerID, String name, HashMap contactInfo, ArrayList travelDocuments) {
        this.passengerID = passengerID;
        this.name = name;
        this.contactInfo = contactInfo;
        this.travelDocuments = travelDocuments;
    }

    public UUID getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(UUID passengerID) {
        this.passengerID = passengerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(HashMap contactInfo) {
        this.contactInfo = contactInfo;
    }

    public ArrayList getTravelDocuments() {
        return travelDocuments;
    }

    public void setTravelDocuments(ArrayList travelDocuments) {
        this.travelDocuments = travelDocuments;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerID=" + passengerID +
                ", name='" + name + '\'' +
                ", contactInfo=" + contactInfo +
                ", travelDocuments=" + travelDocuments +
                '}';
    }
}

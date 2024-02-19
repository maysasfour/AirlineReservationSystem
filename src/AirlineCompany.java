import java.util.HashMap;
import java.util.UUID;

public class AirlineCompany {
    private UUID airlineID;
    private String name;
    private String logo;
    private String fleetInformation;
    private HashMap contactInfo;

    public AirlineCompany(){

    }

    public AirlineCompany(UUID airlineID, String name, String logo, String fleetInformation, HashMap contactInfo) {
        this.airlineID = airlineID;
        this.name = name;
        this.logo = logo;
        this.fleetInformation = fleetInformation;
        this.contactInfo = contactInfo;
    }

    public UUID getAirlineID() {
        return airlineID;
    }

    public void setAirlineID(UUID airlineID) {
        this.airlineID = airlineID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getFleetInformation() {
        return fleetInformation;
    }

    public void setFleetInformation(String fleetInformation) {
        this.fleetInformation = fleetInformation;
    }

    public HashMap getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(HashMap contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "AirlineCompany{" +
                "airlineID=" + airlineID +
                ", name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", fleetInformation='" + fleetInformation + '\'' +
                ", contactInfo=" + contactInfo +
                '}';
    }
}

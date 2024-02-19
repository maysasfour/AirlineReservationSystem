import java.util.UUID;

public class Airport {
    private UUID airportID;
    private String code;
    private String name;
    private String city;
    private String country;
    public Airport(){

    }

    public Airport(UUID airportID, String code, String name, String city, String country) {
        this.airportID = airportID;
        this.code = code;
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public UUID getAirportID() {
        return airportID;
    }

    public void setAirportID(UUID airportID) {
        this.airportID = airportID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportID=" + airportID +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

import java.util.Date;
import java.util.UUID;

public class Flight {
    private UUID flightID;
    private String departureAirport;
    private String arrivalAirport;
    private Date departureDate;
    private Date arrivalDate;
    private String duration;
    private Double fare;
    private int availableSeats;
    private AirlineCompany airline;

    public Flight(){

    }

    public Flight(UUID flightID, String departureAirport, String arrivalAirport, Date departureDate, Date arrivalDate, String duration, Double fare, int availableSeats, AirlineCompany airline) {
        this.flightID = flightID;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.duration = duration;
        this.fare = fare;
        this.availableSeats = availableSeats;
        this.airline = airline;
    }

    public UUID getFlightID() {
        return flightID;
    }

    public void setFlightID(UUID flightID) {
        this.flightID = flightID;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public AirlineCompany getAirline() {
        return airline;
    }

    public void setAirline(AirlineCompany airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightID=" + flightID +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", duration='" + duration + '\'' +
                ", fare=" + fare +
                ", availableSeats=" + availableSeats +
                ", airline=" + airline +
                '}';
    }
}

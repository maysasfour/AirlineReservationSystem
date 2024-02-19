import java.util.Date;
import java.util.UUID;

public class Reservation {
    private UUID reservationID;
    private Flight flight;
    private Passenger passenger;
    private String confirmationNumber;
    private Date dateCraeted;
    private String status;
    private PaymentMethod paymentMethod;
    private String specialRequests;
    public Reservation(){

    }

    public Reservation(UUID reservationID, Flight flight, Passenger passenger, String confirmationNumber, Date dateCraeted, String status, PaymentMethod paymentMethod, String specialRequests) {
        this.reservationID = reservationID;
        this.flight = flight;
        this.passenger = passenger;
        this.confirmationNumber = confirmationNumber;
        this.dateCraeted = dateCraeted;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.specialRequests = specialRequests;
    }

    public UUID getReservationID() {
        return reservationID;
    }

    public void setReservationID(UUID reservationID) {
        this.reservationID = reservationID;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public Date getDateCraeted() {
        return dateCraeted;
    }

    public void setDateCraeted(Date dateCraeted) {
        this.dateCraeted = dateCraeted;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationID=" + reservationID +
                ", flight=" + flight +
                ", passenger=" + passenger +
                ", confirmationNumber='" + confirmationNumber + '\'' +
                ", dateCraeted=" + dateCraeted +
                ", status='" + status + '\'' +
                ", paymentMethod=" + paymentMethod +
                ", specialRequests='" + specialRequests + '\'' +
                '}';
    }
}

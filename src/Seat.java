public class Seat {
    private int seatID;
    private String type;
    private String location;
    public Seat(){

    }

    public Seat(int seatID, String type, String location) {
        this.seatID = seatID;
        this.type = type;
        this.location = location;
    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatID=" + seatID +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

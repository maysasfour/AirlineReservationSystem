import java.util.Date;
import java.util.UUID;

public class Transaction {
    private UUID transactionID;
    private Double amount;
    private Date date;
    private String status;
    public Transaction(){

    }

    public Transaction(UUID transactionID, Double amount, Date date, String status) {
        this.transactionID = transactionID;
        this.amount = amount;
        this.date = date;
        this.status = status;
    }

    public UUID getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(UUID transactionID) {
        this.transactionID = transactionID;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID=" + transactionID +
                ", amount=" + amount +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}

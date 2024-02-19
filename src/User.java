import java.util.Objects;
import java.util.UUID;

public class User {
    private UUID userID;
    private String username;
    private String hashedPassword;
    private String userType;
    private int loginAttempts;
    private String accountStatus;

    public User(){

    }

    public User(UUID userID, String username, String hashedPassword, String userType, int loginAttempts, String accountStatus) {
        this.userID = userID;
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.userType = userType;
        this.loginAttempts = loginAttempts;
        this.accountStatus = accountStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(hashedPassword, user.hashedPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashedPassword);
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", userType='" + userType + '\'' +
                ", loginAttempts=" + loginAttempts +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }
}

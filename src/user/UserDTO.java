package user;

public class UserDTO {
	public UserDTO() {}
	
	public UserDTO(String userID, String userPassword) {
		super();
		this.userID = userID;
		this.userPassword = userPassword;
	}
	String userID;
	String userPassword;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String toString() {
		return "UserDTO [userID=" + userID + ", userPassword=" + userPassword + "]";
	}
}

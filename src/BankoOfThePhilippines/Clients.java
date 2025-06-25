package BankoOfThePhilippines;

public class Clients {
	private String password;
	private String userType;
	private Integer userKey;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Integer getUserKey() {
		return userKey;
	}

	public void setUserKey(Integer userKey) {
		this.userKey = userKey;
	}

	public Clients(String password, String userType, Integer userKey) {
		this.password = password;
		this.userType = userType;
		this.userKey = userKey;
	}
	
	@Override
	public String toString() {
		return String.join(" - ", userType, password);
	}
	
	
}











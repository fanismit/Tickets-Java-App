package mainpackage;

public class Users {
	String name, username, password = "", email;

	public Users(String name, String username, String password, String email) {

		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Methods
	public boolean login(String username, String password) {
		// Check if user exists
		if (userExists(username, password)) {
			return true;
		} else {
			return false;
		}
	}

	public void logout() {

	}

	public boolean userExists(String username, String password) {
		// Search credentials in a database or file
		return true;
	}
}
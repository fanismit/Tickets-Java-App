package mainpackage.users;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Users {
	String name, username, password, email;

	public Users() {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a name:");
		name = input.nextLine();
		while(true){
			if(!nameIsValid(name)){
				System.out.println("Please enter a valid name:");
				name = input.nextLine();
			}else break;
		}

		System.out.println("Please enter an username:");
		username = input.nextLine();

		System.out.println("Please enter a password:");
		password = input.nextLine();
		while(true){
			if(!passwordIsValid(password)){
				System.out.println("Password Must Have at Least:\n1) one Upper case letter\n2) one Lower case letter\n3) one Digit\n4) one Special character\n5) 8 characters");
				password = input.nextLine();
			}else break;
		}

		System.out.println("Please enter an email address:");
		email = input.nextLine();
		while(true){
			if(!emailIsValid(email)) {
				System.out.println("Please enter a valid email address:");
				email = input.nextLine();
			}else break;
		}
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
			System.out.println("User Exists/Welcome"+username);
			return true;
		} else {
			System.out.println("Incorrect credentials");
			return false;
		}
	}

	public void logout() {
		// Under implimentation
	}

	public boolean userExists(String username, String password) {
		// Search credentials in a database or file
		// Use search algorithm
		return true;
	}

	private static boolean emailIsValid(String email){
		// Email pattern
		String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\." +
				"[a-zA-Z0-9_+&*-]+)*@" +
				"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
				"A-Z]{2,7}$";
		Pattern p = Pattern.compile(emailPattern);

		Matcher m = p.matcher(email);

		return m.matches();
	}

	private static boolean nameIsValid(String name){
		return name.matches("[a-zA-Z]+"); // Name must have only letters
	}

	private static boolean passwordIsValid(String password){
		final int MIN_PASSWORD_LENGTH = 8;

		// Check for password's length
		if(password.length() < MIN_PASSWORD_LENGTH){
			return false;
		}

		//Check if password has at least 1 Upper, 1 Lower case character, 1 Digit and 1 Special character.
		boolean hasUpperChar = false;
		boolean hasLowerChar = false;
		boolean hasDigit = false;
		boolean hasSpecialChar = false;
		
		String pattern = "[^a-zA-Z0-9]"; // Exclude all the characters instead of the special chars
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(password);

		// Check if password has a special char
		if (m.find()){
			hasSpecialChar = true;
		}
		
		// Check for Lower, Upper case chars and digits
		for(char c: password.toCharArray()) {
			if (Character.isUpperCase(c)) {
				hasUpperChar = true;
			} else if (Character.isLowerCase(c)) {
				hasLowerChar = true;
			} else if (Character.isDigit(c)) {
				hasDigit = true;
			}
		}
		return hasUpperChar && hasLowerChar && hasDigit && hasSpecialChar;
	}
}
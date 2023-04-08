package mainpackage;

public class Admins {
    // Attributes
    private String adminName;
    private String email;
    private String password;
    private int adminId;

    // Constructor
    public Admins(String adminName, String email, String password, int adminId) {
        this.adminName = adminName;
        this.email = email;
        this.password = password;
        this.adminId = adminId;
    }

    // Getters and Setters
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

 // Methods
    public void createUser() {
        System.out.println("Creating a new user.");
    }

    public void updateUser() {
        System.out.println("Updating user details.");
    }

    public void deleteUser() {
        System.out.println("Deleting a user.");
    }

    public void searchUser() {
        System.out.println("Searching for a user.");
    }

    public void viewAllUsers() {
        System.out.println("Viewing all users.");
    }

    public void registerAdmin() {
        System.out.println("Registering a new admin.");
    }
}
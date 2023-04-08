package mainpackage;

public class Admins extends Users{
    // Attributes
    private String adminId;

    // Constructor
    public Admins(String name, String username, String password, String email, String adminId) {
        super(name, username, password, email);
        this.adminId = adminId;
    }

   // Getters and Setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
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

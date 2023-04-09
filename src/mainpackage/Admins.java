package mainpackage;

public class Admins extends Users{
    // Attributes
    private static int nextId = 0;
    private final int adminId;

    // Constructor
    public Admins() {
        super();
        this.adminId = nextId++;
    }

    // Getters and Setters
    public int getAdminId() {
        return adminId;
    }

    // Methods
    public void createUser(boolean isCustomer) {
        if (isCustomer){
            //Customers customer = new Customers();
        }else{

        }
        System.out.println("Creating a new user.");
    }

    public void updateUser() {
        //
        System.out.println("Updating user details.");
    }

    public void deleteUser(String username, String adminId) {
        // Search user in file or database
        // delete user data
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

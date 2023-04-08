public class Main {
    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        Scanner usernameInput = new Scanner(System.in);
        Scanner passwordInput = new Scanner(System.in);
        Scanner emailInput = new Scanner(System.in);

        int choice;

        System.out.println("Please enter a name:");
        String name = nameInput.nextLine();
        while(true){
            if(!nameIsValid(name)){
                System.out.println("Please enter a valid name:");
                nameInput = new Scanner(System.in);
                name = nameInput.nextLine();
            }else break;
        }

        System.out.println("Please enter an username:");
        String username = usernameInput.nextLine();

        System.out.println("Please enter a password:");
        String password = passwordInput.nextLine();
        while(true){
            if(!passwordIsValid(password)){
                System.out.println("Password Must Have: \n1) At least one Upper case letter\n2) At least one Lower case letter\n"
                        + "3) At least one Digit\n4) At least one Special character\n5) More than 8 characters");
                passwordInput = new Scanner(System.in);
                password = passwordInput.nextLine();
            }else break;
        }

        System.out.println("Please enter an email address:");
        String email = emailInput.nextLine();
        while(true){
            if(!emailIsValid(email)) {
                System.out.println("Please enter a valid email address:");
                emailInput = new Scanner(System.in);
                email = emailInput.nextLine();
            }else break;
        }

        while(true){
            System.out.println("######### Ticket-Seats Manager #########");
            System.out.println("Please, select your option:\n1) Customer\n2) Admin\n3) Content Admin\n4) Film\n5) Cinema\n6) Provoles ");
            Scanner choiceInput = new Scanner(System.in);
            choice = choiceInput.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Customer Option Selected!");
                    break;
                case 2:
                    System.out.println("Admin Option Selected!");
                    break;
                case 3:
                    System.out.println("Content Admin Option Selected!");
                    break;
                case 4:
                    System.out.println("Film Option Selected!");
                    break;
                case 5:
                    System.out.println("Cinema Option Selected!");
                    break;
                case 6:
                    System.out.println("Provoles Option Selected!");
                    break;
                default:
                    return;
            }
        }
    }

    private static boolean emailIsValid(String email){
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern p = Pattern.compile(emailPattern);

        Matcher m = p.matcher(email);

        if (m.matches()){
            return true;
        }
        return false;
    }

    private static boolean nameIsValid(String name){
        return name.matches("[a-zA-Z]+");
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
        String pattern = "[^a-zA-Z0-9]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);

        if (m.find()){
            hasSpecialChar = true;
        }
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
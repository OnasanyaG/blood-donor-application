import java.util.Scanner;

public class DonorUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DonorCollection dc = new DonorCollection(); //creating DonorCollection object
        boolean exit = false;

        while (!exit) {
            System.out.println("........Online blood donor portal..........");
            System.out.println("1. Adding a Donor");
            System.out.println("2. Display all Donors");
            System.out.println("3. Update Donor");
            System.out.println("4. Delete Donor");
            System.out.println("5. Exit the application");
            System.out.println("Enter an option");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter your first name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter your last name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter your mobile number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Enter your Blood group(A/B/AB/O, +/-): ");
                    String bloodGroup = sc.nextLine().toUpperCase(); //For uniformity when displaying blood group details
                    System.out.print("Enter your city: ");
                    String city = sc.nextLine();
                    System.out.print("Enter your age: ");
                    int age = sc.nextInt();

                    if (age < 18 || age > 60) {
                        System.out.println("Sorry, Donor must be between 18 and 60 years of age.\n");
                    } else {
                        //Adds the donor if age is valid
                        dc.addDonor(firstName, lastName, phoneNumber, bloodGroup, city, age);
                    }
                    break;

                case 2:
                    dc.dispDonor();
                    break;

                case 3:
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter donor's registration ID to update: ");
                    String registrationId = sc.nextLine();
                    System.out.print("Enter updated first name: ");
                    String updatedFirstName = sc.nextLine();
                    System.out.print("Enter updated last name: ");
                    String updatedLastName = sc.nextLine();
                    System.out.print("Enter updated mobile number: ");
                    String updatedMobileNo = sc.nextLine();
                    System.out.print("Enter updated blood group: ");
                    String updatedBloodGroup = sc.nextLine();
                    System.out.print("Enter updated city: ");
                    String updatedCity = sc.nextLine();
                    System.out.print("Enter updated age: ");
                    int updatedAge = sc.nextInt();
                    dc.updateDonorDetails(registrationId, updatedFirstName, updatedLastName, updatedMobileNo, updatedBloodGroup, updatedCity, updatedAge);
                    break;

                case 4:

                    sc.nextLine();
                    System.out.print("Enter donor's registration ID to delete: ");
                    registrationId = sc.nextLine();
                    dc.deleteDetails(registrationId);
                    break;


                case 5:
                    exit = true;
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option");
            }
        }
    }
}

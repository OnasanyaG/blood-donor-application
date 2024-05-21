import java.util.ArrayList;

public class DonorCollection {

    // ArrayList to store Donor objects
    ArrayList<Donor> donors = new ArrayList<>(); //Creating donors array

    public void addDonor(String fname, String lname, String phone, String group, String city, int age) {
        Donor donor = new Donor(fname, lname, phone, group, city, age); //Donor instance created
        donors.add(donor);
        System.out.println("Donor was successfully added with ID: "+ donor.getRegistrationId());
    }

    //Method that displays donors' details
    public void dispDonor() {

        //checks if Donor array is empty
        if (donors.isEmpty()) {
            System.out.println("No donors available.");
        } else {
            System.out.println("Donors Details");
            for (Donor d : donors) {
                System.out.println(d);
            }

        }
    }
    public Donor findDonor(String registrationId) {
        for (Donor donor : donors) {
            if (donor.getRegistrationId().equals(registrationId)) {
                return donor;
            }
        }
        return null; // Donor not found
    }

    public void deleteDetails(String registrationId){

        Donor donor = findDonor(registrationId);
        if (donor !=null){
            donors.remove(donor);
            System.out.println("Donor deleted successfully");

        }else {
            System.out.println("Donor with ID " + registrationId + " not found.");
        }

    }

    public void updateDonorDetails(String registrationId, String firstName, String lastName, String phone, String bloodGroup, String city, int age) {
        Donor donor = findDonor(registrationId);
        if (donor != null) {
            donor.setFirstName(firstName);
            donor.setLastName(lastName);
            donor.setMobileNo(phone);
            donor.setBloodGroup(bloodGroup);
            donor.setCity(city);
            donor.setAge(age);
            System.out.println("Donor details updated successfully.");
        } else {
            System.out.println("Donor with ID " + registrationId + " not found.");
        }
    }


}

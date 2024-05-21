public class Donor {
    private static int nextId = 1000; //'static' is used so that every donor can use the 'nextId' variable
    private int registrationId;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String bloodGroup;
    private int age;
    private String city;

    //Creating constructor
    public Donor(String firstName, String lastName, String mobileNo, String bloodGroup, String city, int age) {
        this.registrationId = nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mobileNo = mobileNo;
        this.bloodGroup = bloodGroup;
        this.city = city;
    }

    //Getter and Setter methods
    public String getRegistrationId() {
        return "BD" + registrationId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //To display the values in string form
    @Override
    public String toString() {
        return "\n  ID: \t\t" + getRegistrationId() +
                "\nFirst Name:  " + getFirstName() +
                " \nLast Name:\t " + getLastName() +
                " \nMobile No:\t " + getMobileNo() +
                " \nBlood Group: " + getBloodGroup() +
                " \nAge:\t\t " + getAge() +
                " \nCity:\t\t " + getCity();
    }
}

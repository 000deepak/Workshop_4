package workshop_4;


import java.util.Objects;

/*purpose:provide data declaration for contacts
*
* */

public class ContactDetails {

    private String first_Name;
    private String last_Name;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phone;
    private String email;


    public ContactDetails(String first_Name, String last_Name, String address, String city, String state, int zip,
                          long phone, String email) {
        super();
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;

    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public int hashCode() {
        return Objects.hash(first_Name,last_Name);
    }


    @Override
    public boolean equals(Object o) {
        ContactDetails contactDetails = (ContactDetails) o;
        if ((this.first_Name).equals(contactDetails.first_Name) && (this.last_Name.equals(contactDetails.last_Name)))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Contact{" +
                ", first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

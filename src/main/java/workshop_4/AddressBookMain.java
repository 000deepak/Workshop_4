package workshop_4;

import java.util.HashSet;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);

    static HashSet<ContactDetails> contact = new HashSet<>();

    public static void main(String[] args) throws AddressBookException {
        System.out.println("welcome to addressBook program");

           try{
               addContact();
           }catch (Exception e){
               System.out.println();
               e.printStackTrace();
           }
        showContacts(contact);
    }

    public static boolean addContact() throws AddressBookException{
        System.out.println("enter first name");
        String first_Name= sc.next();
        System.out.println("enter last name");
        String last_Name= sc.next();
        System.out.println("enter address");
        String address= sc.next();
        System.out.println("enter city");
        String city= sc.next();
        System.out.println("enter state");
        String state= sc.next();
        System.out.println("enter zip");
        String zip= sc.next();
        System.out.println("enter phone");
        String phone= sc.next();
        System.out.println("enter email");
        String email= sc.next();

        ContactDetails con = new ContactDetails(first_Name,last_Name, address,  city,  state, zip,
                phone, email);

        boolean added = contact.add(con);
        return added;
    }

    public static void showContacts (HashSet<ContactDetails> contact) throws AddressBookException{
        for(ContactDetails c:contact){
            System.out.println(c);
        }
    }
}

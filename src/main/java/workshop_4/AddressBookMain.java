package workshop_4;

import java.util.HashSet;
import java.util.Scanner;
/*
 * @Welcome -The  program implements an application of addressbook problem.
 * @author  -deepak
 * @version -1.0
 * @since   -2021-11-17
 */


public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);

    static HashSet<ContactDetails> contact = new HashSet<>();

    public static void main(String[] args) throws AddressBookException {
        System.out.println("welcome to addressBook program");

        try {
            if (!addContact()) {
                throw new AddressBookException("enter correct data");
            }

        } catch (AddressBookException a) {
            System.out.println();
            a.printStackTrace();
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }

        showContacts(contact);
    }

    /*purpose:to add contact to addressBook.
     *
     */
    public static boolean addContact() throws AddressBookException {

        ContactDetails con = new ContactDetails();

        System.out.println("enter first name");
        con.setFirst_Name(sc.next());
        System.out.println("enter last name");
        con.setLast_Name(sc.next());
        System.out.println("enter address");
        con.setAddress(sc.next());
        System.out.println("enter city");
        con.setCity(sc.next());
        System.out.println("enter state");
        con.setState(sc.next());
        System.out.println("enter zip");
        con.setZip(sc.nextInt());
        System.out.println("enter phone");
        con.setPhone(sc.nextInt());
        System.out.println("enter email");
        con.setEmail(sc.next());

        boolean added = contact.add(con);
        return added;
    }

    public static void showContacts(HashSet<ContactDetails> contact) throws AddressBookException {
        for (ContactDetails c : contact) {
            System.out.println(c);
        }
    }
}

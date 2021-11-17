import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import workshop_4.AddressBookMain;
import workshop_4.ContactDetails;

import java.util.HashSet;


public class AddressBookTest {

    AddressBookMain main = new AddressBookMain();
    HashSet<ContactDetails> contact = new HashSet<>();

    @Test
    public void WhenGivenContactDetails_addToBook_WhenAddedShouldReturnTrue(){

        ContactDetails c = new ContactDetails("deepak","kumbhar","warana","kolhapur",
                "mah",416312,
                9850,"deepak@gmail.com");
        boolean output = contact.add(c);

        Assertions.assertTrue(output);
    }
}

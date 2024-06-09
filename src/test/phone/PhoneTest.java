package test.phone;

import main.phone.Contact;
import main.phone.MobilePhone;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneTest {
    private MobilePhone mobilePhone;
    private Contact contact1;
    private Contact contact2;
    private ArrayList<Contact> myContacts;

    @BeforeEach
    void beforeEach(){
        mobilePhone = new MobilePhone("+3729878687");
        contact1 = new Contact("Mario","+372474848");
        contact2 = new Contact("Toivo", "+33304500");
        myContacts = new ArrayList<>();
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        myContacts = mobilePhone.getContacts();
    }

    @Test
    void testAddNewContact(){
        assertEquals(2, myContacts.size());
        assertEquals(contact1,myContacts.get(0));
    }
    @Test
    void testViewContacts(){

        mobilePhone.printContacts();

    }
    @Test
    void testDeleteContact(){

        mobilePhone.removeContact(contact1);
        assertEquals(1,myContacts.size());
        assertEquals(contact2,myContacts.get(0));
    }
    @Test
    void testUpdateContact(){

        Contact contact3 = new Contact("Leena", "+309877500");
        assertTrue(mobilePhone.updateContact(contact1, contact3));
        assertEquals("Leena",myContacts.get(0).getName());


    }
    @Test
    void testQueryContacts(){

        assertEquals(contact1,mobilePhone.queryContact("Mario"));
    }














}

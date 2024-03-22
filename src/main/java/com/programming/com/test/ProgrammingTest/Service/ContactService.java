package com.programming.com.test.ProgrammingTest.Service;

import com.programming.com.test.ProgrammingTest.Model.Contact;
import com.programming.com.test.ProgrammingTest.Model.Customer;
import com.programming.com.test.ProgrammingTest.Repository.ContactRepository;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public Contact registerCustomer(@Valid Contact contact) {
        Contact existingContact = contactRepository.findByEmailOrPhoneNumber(contactDTO.getEmail(), contactDTO.getPhoneNumber());
        if (existingContact != null) {
            // Link the new contact to the existing one
            contactDTO.setLinkedId(existingContact.getId());
            contactDTO.setLinkPrecedence("secondary");
        }
        return customer;
    }

    public String getCustomerByEmail(@Valid String email){
        contactRepository.findByEmail(contact.getEmail);
        return email;
    }

    public Contact getCustomerByphoneNumber(@Valid Contact contact){
        contactRepository.findByphoneNumber();
        return contact;
    }

}

package com.programming.com.test.ProgrammingTest.Controller;

import com.programming.com.test.ProgrammingTest.Model.Contact;
import com.programming.com.test.ProgrammingTest.Model.Customer;
import com.programming.com.test.ProgrammingTest.Service.ContactService;

@RestController
@RequestMapping("/customer")
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Contact registerCustomer(@Valid @RequestBody Contact contact) {
        contactService.registerCustomer(contact);
        return contact;
    }

    @GetMapping("/{email}")
    public String getCustomerByEmail(@PathVariable String email){
        return contactService.getCustomerByEmail(email);
    }

    @GetMapping("/{phoneNumber}")
    public Optional<Contact> getCustomerByphoneNumber(@PathVariable String phoneNumber){
        return contactService.getCustomerByphoneNumber(phoneNumber);
    }
}

package com.example.utilityApis.contact;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "info/v1/")
public class ContactController {

    private final ContactSvc contactSvc;

    public ContactController(ContactSvc contactSvc) {
        this.contactSvc = contactSvc;
    }


    @GetMapping("getAllContacts")
    public List<Contact> getContacts() {
        return contactSvc.getContacts();
    }

    @PostMapping(path = "addContact")
    public void createContact(@RequestBody Contact contact) {
        contactSvc.addContact(contact);
    }

}

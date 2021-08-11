package com.example.utilityApis.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="info/v1/contact")
public class ContactController {

    private final ContactSvc contactSvc;


    public ContactController(ContactSvc contactSvc) {
        this.contactSvc = contactSvc;
    }


    @GetMapping
    public List<Contact> getContacts(){
        return contactSvc.getContacts();
    }
}

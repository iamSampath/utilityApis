package com.example.utilityApis.contact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="info/v1/contact")
public class ContactController {

    @GetMapping
    public List<Contact> getContacts() {

        Contact contactDetails = new Contact();
        List<Contact> contactInfo = new ArrayList<>();
        contactDetails.setId(1L);
        contactDetails.setName("Rover Bot");
        contactDetails.setEmail("somename@emailname.com");
        contactDetails.setPhone("+1-123-456-7890");
        contactDetails.setCity("Seattle");
        contactInfo.add(contactDetails);
        return contactInfo;
    }
}

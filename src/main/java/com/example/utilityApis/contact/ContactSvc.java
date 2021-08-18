package com.example.utilityApis.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ContactSvc {

    @Autowired
    public ContactSvc(UtilityDataRepository utilityDataRepository) {
        this.utilityDataRepository = utilityDataRepository;
    }

    private final UtilityDataRepository utilityDataRepository;

    public void addContact(Contact contact) {

        Optional<Contact> findContactByEmail =
                utilityDataRepository.findContactByEmail(contact.getEmail());

        Optional<Contact> findContactByPhone = utilityDataRepository
                .findContactByPhone(contact.getPhone());

        if (findContactByEmail.isPresent()) {
            throw new IllegalStateException("Email is already used by other user!!");
        }

        if (findContactByPhone.isPresent()) {
            throw new IllegalStateException("Phone Number is already used by other user!!");
        }

        if (!contact.getEmail().equals("") && !contact.getPhone().equals("")
                && !contact.getCity().equals("") && !contact.getName().equals("")) {
            utilityDataRepository.save(contact);
        }else{
            throw new IllegalStateException("Email or Phone or City or Name should not be Empty!!");
        }
    }

    @GetMapping
    public List<Contact> getContacts() {
        return utilityDataRepository.findAll();
    }
}

package com.example.utilityApis.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ContactSvc {

    @Autowired
    public ContactSvc(UtilityDataRepository utilityDataRepository) {
        this.utilityDataRepository = utilityDataRepository;
    }

    private final UtilityDataRepository utilityDataRepository;

    @GetMapping
    public List<Contact> getContacts() {
        return utilityDataRepository.findAll();
    }
}

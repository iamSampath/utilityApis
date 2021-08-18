package com.example.utilityApis.contact;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ContactConfig {

    @Bean
    CommandLineRunner commandLineRunner(UtilityDataRepository repo) {
        return args -> {

            Contact somename1 = new Contact(
                    "Some name 1",
                    "someemail@emailcomapny1.com",
                    "+1-123-456-7893",
                    "Seattle"
            );

            Contact somename2 = new Contact(
                    "Some name 2",
                    "someemail@emailcomapny2.com",
                    "+1-123-456-7890",
                    "Seattle"
            );

            List<Contact> contactList = new ArrayList<Contact>();
            contactList.add(somename1);
            contactList.add(somename2);
            repo.saveAll(contactList);
        };
    }
}

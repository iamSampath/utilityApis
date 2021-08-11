package com.example.utilityApis.contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilityDataRepository extends JpaRepository<Contact, Long> {

}

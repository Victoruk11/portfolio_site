package com.victoruk.portfolio_site.repository;

import com.victoruk.portfolio_site.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}

package com.victoruk.portfolio_site.service;

import com.victoruk.portfolio_site.dto.ContactDTO;
import com.victoruk.portfolio_site.entity.Contact;
import com.victoruk.portfolio_site.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public ContactDTO createContact(ContactDTO contactDTO) {
        Contact contact = new Contact();
        contact.setName(contactDTO.getName());
        contact.setEmail(contactDTO.getEmail());
        contact.setMessage(contactDTO.getMessage());
        contactRepository.save(contact);
        return contactDTO;
    }
}

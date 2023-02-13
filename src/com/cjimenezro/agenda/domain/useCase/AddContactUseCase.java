package com.cjimenezro.agenda.domain.useCase;

import com.cjimenezro.agenda.domain.models.Contact;
import com.cjimenezro.agenda.domain.models.ContactRepository;

public class AddContactUseCase {

    private ContactRepository contactRepository;

    public AddContactUseCase(ContactRepository contactRepository){
        this.contactRepository=contactRepository;
    }

    public void execute (Contact contact){
        contactRepository.save(contact);
    }
}

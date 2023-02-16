package com.cjimenezro.agenda.domain.useCase;

import com.cjimenezro.agenda.domain.models.Contact;
import com.cjimenezro.agenda.domain.models.ContactRepository;

import java.util.List;

public class GetContactUseCase {

    private ContactRepository contactRepository

    public GetContactUseCase(ContactRepository contactRepository){
        this.contactRepository=contactRepository;
    }

    public List<Contact> execute(){

    }
}

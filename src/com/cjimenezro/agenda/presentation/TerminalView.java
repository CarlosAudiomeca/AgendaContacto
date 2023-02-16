package com.cjimenezro.agenda.presentation;

import com.cjimenezro.agenda.data.ContactDataRepository;
import com.cjimenezro.agenda.domain.models.Contact;
import com.cjimenezro.agenda.domain.models.ContactRepository;
import com.cjimenezro.agenda.domain.useCase.AddContactUseCase;
import com.cjimenezro.agenda.domain.useCase.GetContactUseCase;

import javax.swing.text.html.StyleSheet;
import java.util.List;

public class TerminalView {

    public void init(){
        ContactRepository contactRepository = new ContactDataRepository();


        Contact contact = new Contact();
        contact.setId(20);

        AddContactUseCase addContactUseCase = new AddContactUseCase(contactRepository);
        addContactUseCase.execute(contact);

        GetContactUseCase getContactUseCase = new GetContactUseCase(contactRepository);
        List<Contact> contactList = getContactUseCase.execute();
        System.out.println(contactList.size());
    }
}

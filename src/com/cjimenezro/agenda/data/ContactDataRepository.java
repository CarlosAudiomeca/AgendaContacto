package com.cjimenezro.agenda.data;

import com.cjimenezro.agenda.data.local.ContactMemLocalDataSource;
import com.cjimenezro.agenda.domain.models.Contact;
import com.cjimenezro.agenda.domain.models.ContactRepository;

public class ContactDataRepository implements ContactRepository {

    private ContactMemLocalDataSource localDataSource= new ContactMemLocalDataSource.getInstance();

    @Override
    public void save(Contact contact) {

    }
}

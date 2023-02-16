package com.cjimenezro.agenda.domain.models;

import java.util.List;

public interface ContactRepository {

    public void save (Contact contact);

    public List<Contact> getAll();

}

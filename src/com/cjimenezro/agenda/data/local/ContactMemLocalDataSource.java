package com.cjimenezro.agenda.data.local;

import com.cjimenezro.agenda.domain.models.Contact;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class ContactMemLocalDataSource {

    private static ContactMemLocalDataSource instance = null;

    private Map<Integer, Contact> storage = new TreeMap<>();

    private ContactMemLocalDataSource(){

    }

    public void save(Contact contact) {
        storage.put(contact.getId())
    }

    public Contact findById(Integer alumnoId) {
        return storage.get(con)
    }

    public static ContactMemLocalDataSource getInstance(){
        if(instance==null){
            instance=new ContactMemLocalDataSource();
        }
        return instance;
    }

}

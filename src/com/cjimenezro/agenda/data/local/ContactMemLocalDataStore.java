package com.cjimenezro.agenda.data.local;

import com.cjimenezro.agenda.Main;
import com.cjimenezro.agenda.domain.models.Contact;

import java.util.Map;
import java.util.TreeMap;

public class ContactMemLocalDataStore {

    private static ContactMemLocalDataStore instance = null;

    private Map<Integer, Contact> storage = new TreeMap<>();

    private ContactMemLocalDataStore(){

    }

    public static ContactMemLocalDataStore getInstance(){
        if(instance==null){
            instance=new ContactMemLocalDataStore();
        }
        return instance;
    }

}

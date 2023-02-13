package com.cjimenezro.agenda.data.local;

import com.cjimenezro.agenda.domain.models.Contact;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.patternrepository.domain.models.Alumno;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ContactFileLocalDataSource {

    private static ContactFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Contact>>() {
    }.getType();

    private ContactFileLocalDataSource() {
    }

    public void save(Contact contact) {
        List<Contact> contacts = findAll();
        contacts.add(contact);
        saveToFile(contacts);
    }

    private void saveToFile(List<Contact> alumnos) {
        try {
            FileWriter myWriter = new FileWriter("alumnos.txt");
            myWriter.write(gson.toJson(alumnos));
            myWriter.close();
            System.out.println("Alumno guardado correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }


    public Contact findById(Integer alumnoId) {
        List<Contact> contacts = findAll();
        for (Contact alumno : contacts) {
            if (Objects.equals(contacts.id, alumnoId)) {
                return alumno;
            }
        }
        return null;
    }

    public List<Contact> findAll() {
        try {
            File myObj = new File("alumnos.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeAlumnList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new ArrayList<Contact>();
    }

    public static ContactFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new ContactFileLocalDataSource();
        }
        return instance;
    }
}

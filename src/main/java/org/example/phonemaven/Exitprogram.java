package org.example.phonemaven;


import java.io.IOException;

public class Exitprogram implements MenuAction {
    InMemoryContactsService inMemoryContactsService;

    public Exitprogram(InMemoryContactsService inMemoryContactsService) {
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction() throws IOException {


    }

    @Override
    public String getName() {
        return "Выйти из програмы";
    }

    @Override
    public boolean closeAfter() {
        return true;
    }






}

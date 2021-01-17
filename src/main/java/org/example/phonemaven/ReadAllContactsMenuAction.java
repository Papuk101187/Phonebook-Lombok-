package org.example.phonemaven;

public class ReadAllContactsMenuAction implements MenuAction {

    InMemoryContactsService inMemoryContactsService;

    public ReadAllContactsMenuAction(InMemoryContactsService inMemoryContactsService) {
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction() {
        Contact[] contacts = inMemoryContactsService.contactsList.toArray(new Contact[0]);
        for(int i=0;i<inMemoryContactsService.contactsList.size();i++){
            System.out.println("Имя  "+ contacts[i].name+" / Номер телефона "+ contacts[i].phone);
        }


    }

    @Override
    public String getName() {
        return "Показать список телефонных номеров";

    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}

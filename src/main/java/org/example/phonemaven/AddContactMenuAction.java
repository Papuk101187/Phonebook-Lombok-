package org.example.phonemaven;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddContactMenuAction implements MenuAction {
    InMemoryContactsService inMemoryContactsService;

    public AddContactMenuAction(InMemoryContactsService inMemoryContactsService) {
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction() throws IOException {

        System.out.println("- Введите имя");
        BufferedReader nam = new BufferedReader(new InputStreamReader(System.in)); //
        System.out.println("- Введите номер телефона");
        BufferedReader phon = new BufferedReader(new InputStreamReader(System.in)); //
        String name = nam.readLine();
        String phone = phon.readLine();
        Contact contact = new Contact(name, phone);

        if (inMemoryContactsService.check(contact)) {
            inMemoryContactsService.add(contact);
        } else {
            System.out.println("Вы некорректно ввели номер телефона");

        }

    }

    @Override
    public String getName() {
        return "Добавить контакт в меню ";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }


}

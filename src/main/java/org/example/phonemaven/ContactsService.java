package org.example.phonemaven;


public interface ContactsService {


    //Contact[] getAll(); отключили переключив на List
    void remove(int index);
    void add(Contact contact);
    String getContactsWhereNameStartsWith(String startOfName);
    String getPartsPhone(String startOfName);


}

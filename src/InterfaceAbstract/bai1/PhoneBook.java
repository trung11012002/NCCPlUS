/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAbstract.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author admin
 */
public class PhoneBook extends Phone {

    private ArrayList<PhoneBook> PhoneList;

    public PhoneBook() {
        PhoneList = new ArrayList();
    }

    public PhoneBook(String name, String phone) {
        super(name, phone);
    }

    @Override
    void insertPhone(String name, String phone) {
        Phone phoneData = new PhoneBook(name, phone);
        if (this.PhoneList.size() == 0) {
            PhoneList.add((PhoneBook) phoneData);
        } else {
            boolean checkName = false;

            for (int i = 0; i < PhoneList.size(); i++) {
                PhoneBook phoneBook = PhoneList.get(i);
                if (phoneBook.getName().equals(name)) {
                    checkName = true;
                    if (!phoneBook.getPhone().equals(phone)) {
                        PhoneList.get(i).setPhone(phoneBook.getPhone() + " : " + phoneData.getPhone());
                    }
                    break;
                }
            }

            if (checkName == false) {
                this.PhoneList.add((PhoneBook) phoneData);
            }
        }

    }

    @Override
    void removePhone(String name) {
        for(int i = 0 ; i < this.PhoneList.size() ; i ++){
            PhoneBook phoneBook = PhoneList.get(i);
            if(phoneBook.getName().equals(name)){
                PhoneList.remove(i);
                break;
            }
        }
    }

    @Override
    void updatePhone(String name, String newphone) {
        for(int i = 0 ; i < this.PhoneList.size() ; i ++){
            PhoneBook phoneBook = PhoneList.get(i);
            if(phoneBook.getName().equals(name)){
                phoneBook.setPhone(newphone);
                break;
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for(int i = 0 ; i < this.PhoneList.size() ; i ++){
            PhoneBook phoneBook = PhoneList.get(i);
            if(phoneBook.getName().equals(name)){
                System.out.println(phoneBook.getPhone());
                break;
            }
        }
    }

    @Override
    void sort() {
        Collections.sort(PhoneList, new Comparator<PhoneBook>() {
            @Override
            public int compare(PhoneBook pb1, PhoneBook pb2) {
                return pb1.getName().compareTo(pb2.getName());
            }
        });
    }

    public ArrayList<PhoneBook> getPhoneList() {
        return PhoneList;
    }

    public void setPhoneList(ArrayList<PhoneBook> PhoneList) {
        this.PhoneList = PhoneList;
    }

}

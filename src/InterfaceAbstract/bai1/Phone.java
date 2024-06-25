/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAbstract.bai1;

/**
 *
 * @author admin
 */
public abstract class Phone {
    private String name;
    private String phone;

    public Phone() {
    }
    
    
    public Phone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    
    
    abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name, String newphone);
    abstract void searchPhone(String name);
    abstract void sort();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}

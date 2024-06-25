/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAbstract.bai1;

/**
 *
 * @author admin
 */
public class ManagePhoneBook {
    public static void main(String[] args) {
        PhoneBook phone = new PhoneBook();
        phone.insertPhone("trung", "123");
        phone.insertPhone("trung", "1234");
        phone.insertPhone("duong", "12345");
        
//        phone.removePhone("trung");
//        phone.updatePhone("duong", "123456");
        phone.sort();
        System.out.println(phone.getPhoneList().size());
        for (PhoneBook x : phone.getPhoneList()) {
            System.out.println(x.getName() + " " + x.getPhone());
        }
    }
}

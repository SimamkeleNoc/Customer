package za.ac.cput;

import za.ac.cput.domain.Customer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer.Builder().createCustomer("1901", "nocuzetalent@yahoo").build();
        System.out.println(cust);

    }
}
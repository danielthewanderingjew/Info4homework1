package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ICustomer> customers = new ArrayList<ICustomer>();
        customers.add(new Customer(1, "Jone Doe 1"));
        customers.add(new SilverCustomer(2, "Jone Doe 2"));
        customers.add(new Customer(3,"Jone Doe 3"));
        customers.add(new GoldCustomer(4,"Jone Doe 4"));
        customers.add(new SilverCustomer(5,"Jone Doe 5"));
        customers.add(new Customer(6,"Jone Doe 6"));
        customers.add(new Customer(7,"Jone Doe 7"));
        customers.add(new SilverCustomer(8,"Jone Doe 8"));
        customers.add(new Customer(9,"Jone Doe 9"));
        customers.add(new GoldCustomer(10,"Jone Doe 10"));

        for (ICustomer customer: customers) {

            System.out.println("For 300 product," + customer.getCustomerName() + "Pays" + customer.getPriceForProduct(300));
            System.out.println("For 3000 product," + customer.getCustomerName() + "Pays" + customer.getPriceForProduct(3000));

        }
    }
}

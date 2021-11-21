package com.company;

public class Customer implements ICustomer{

   protected int Id;
   protected String Name;

   public Customer(int id, String name)
   {
       this.Id = id;
       this.Name = name;
   }
    @Override
    public String getCustomerName() {
        return Name;
    }

    @Override
    public double getPriceForProduct(double fullPrice) {
        return fullPrice;
    }
}

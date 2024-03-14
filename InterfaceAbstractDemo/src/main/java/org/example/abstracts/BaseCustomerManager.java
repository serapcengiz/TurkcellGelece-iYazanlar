package org.example.abstracts;

import org.example.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

    public  void save(Customer customer) {
        System.out.println("Kaydedildi");
    }

}

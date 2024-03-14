package org.example.concretes;

import org.example.abstracts.ICustomerCheckService;
import org.example.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {


    @Override
    public boolean checkIfRealCustomer(Customer customer) {
        return true;
    }
}

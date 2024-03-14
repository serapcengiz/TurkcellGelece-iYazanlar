package org.example.abstracts;

import org.example.entities.Customer;

public interface ICustomerCheckService {
    public boolean checkIfRealCustomer(Customer customer);
}

package org.example.adapters;

import org.example.abstracts.ICustomerCheckService;
import org.example.entities.Customer;

public class MerninsServiceAdapter implements ICustomerCheckService{

        @Override
        public boolean checkIfRealCustomer(Customer customer) {

            return customer.getNationalityId()=="21559745716";
        }

}

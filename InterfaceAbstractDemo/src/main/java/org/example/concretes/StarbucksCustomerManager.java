package org.example.concretes;

import org.example.abstracts.BaseCustomerManager;
import org.example.abstracts.ICustomerCheckService;
import org.example.abstracts.ICustomerService;
import org.example.entities.Customer;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private  ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        _customerCheckService = customerCheckService;
    }


    public void save(Customer customer){
        if(_customerCheckService.checkIfRealCustomer(customer)){
            super.save(customer);
            addStar(customer);

        }
        else{
            System.out.println("Not a valid person");
        }
    }
    /*public void checkIfRealPerson(Customer customer){
        throw new NotImplementedException();
    }

     */
    public void addStar(Customer customer){
        System.out.println("Star added to " + customer.getFirstName() + "\n");

    }
}

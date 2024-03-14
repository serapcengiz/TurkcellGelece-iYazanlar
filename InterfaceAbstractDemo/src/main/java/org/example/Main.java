package org.example;

import org.example.abstracts.BaseCustomerManager;
import org.example.adapters.MerninsServiceAdapter;
import org.example.concretes.CustomerCheckManager;
import org.example.concretes.StarbucksCustomerManager;
import org.example.entities.Customer;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MerninsServiceAdapter());
        baseCustomerManager.save(new Customer
                (1,"Serap","Cengiz",new Date(2001,19,12),"21559745716"));




    }
}
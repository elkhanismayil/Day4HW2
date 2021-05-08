package main;

import abstrac.BaseCustomerManager;
import concrete.CustomerCheckManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entity.Customer;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager.save(new Customer(1L, "Engin", "Demirog", LocalDate.of(1985, 03, 05), UUID.randomUUID().toString()));

    }
}

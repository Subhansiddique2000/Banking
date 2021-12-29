package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("US National Bank");

        if(bank.addBranch("NY")) {
            System.out.println("NY branch created");
        }

        bank.addCustomer("NY", "Tim", 50.05);
        bank.addCustomer("NY", "Mike", 175.34);
        bank.addCustomer("NY", "Percy", 220.12);

        bank.addBranch("NJ");
        bank.addCustomer("NJ", "Bob", 150.54);

        bank.addCustomerTransaction("NY", "Tim", 44.22);
        bank.addCustomerTransaction("NY", "Tim", 12.44);
        bank.addCustomerTransaction("NY", "Mike", 1.65);

        bank.listCustomers("NY", true);
        bank.listCustomers("NJ", true);

        bank.addBranch("CA");

        if(!bank.addCustomer("CA", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("NY")) {
            System.out.println("NY branch already exists");
        }

        if(!bank.addCustomerTransaction("NY", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("NY", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}

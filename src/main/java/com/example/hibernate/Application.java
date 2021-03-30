package com.example.hibernate;

import com.example.hibernate.entity.Customer;
import com.example.hibernate.entity.Merchant;
import com.example.hibernate.service.ICustomerService;
import com.example.hibernate.service.IMerchantService;
import com.example.hibernate.service.MerchantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.time.Month;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IMerchantService merchantService = context.getBean(IMerchantService.class);
        Merchant m1 = merchantService.findById(1);
        System.out.println("name = " + m1.getName());

        ICustomerService customerService = context.getBean(ICustomerService.class);
//        Customer customer = customerService.findById(1);
//        System.out.println(customer.toString());

        Customer customer = new Customer();
        customer.setAddress("Independence st. 21, Malaga, Spain");
        customer.setCcNo("11122233344488");
        customer.setCcType("Master Card");
        customer.seteMail("vera@s.com");
        LocalDate dt = LocalDate.of(2018, Month.FEBRUARY, 28);
        customer.setMaturity(java.sql.Date.valueOf(dt));
        customer.setName("Vera Po");

        customerService.save(customer);
        System.out.println("id = " + customer.getId());
//
//        System.out.println("The customer with id = 4 was removed successfully – " + customerService.remove(4));

//        boolean result = customerService.updateCcNo(3, "555555555555");
//        System.out.println("Update finished. Result is - " + result);
//
//        Customer foundById = customerService.findById(3);
//        System.out.println(foundById);
    }
}

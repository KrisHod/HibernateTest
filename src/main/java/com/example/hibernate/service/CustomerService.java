package com.example.hibernate.service;

import com.example.hibernate.entity.Customer;
import com.example.hibernate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    @Transactional
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    @Transactional
    public boolean remove(int id) {
        return customerRepository.remove(id);
    }

    @Override
    @Transactional
    public boolean remove(Customer customer) {
        return customerRepository.remove(customer);
    }

    @Override
    @Transactional
    public boolean updateCcNo(int id, String ccNo) {
        Customer customerToUpdate = customerRepository.findById(id);
        if (customerToUpdate != null) {
            customerToUpdate.setCcNo(ccNo);
            return customerRepository.update(customerToUpdate);
        }
        return false;
        }


    }

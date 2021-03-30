package com.example.hibernate.repository;

import com.example.hibernate.entity.Customer;

public interface ICustomerRepository {
    public Customer findById(int id);
    public void save(Customer customer);
    public boolean remove(int id);
    public boolean remove(Customer customer);
    public boolean update(Customer customerToUpdate);
}

package com.example.hibernate.repository;

import com.example.hibernate.entity.Customer;
import com.example.hibernate.entity.Payment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PaymentRepository implements IPaymentRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public Payment findById(int id) {
        return em.find(Payment.class, id);
    }
}

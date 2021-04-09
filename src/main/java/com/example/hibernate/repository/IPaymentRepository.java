package com.example.hibernate.repository;

import com.example.hibernate.entity.Payment;

public interface IPaymentRepository {
    public Payment findById(int id);
}

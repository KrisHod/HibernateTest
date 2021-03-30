package com.example.hibernate.repository;

import com.example.hibernate.entity.Merchant;

public interface IMerchantRepository {
    public Merchant findById(int id);
    public void save(Merchant merchant);
}

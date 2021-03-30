package com.example.hibernate.service;

import com.example.hibernate.entity.Merchant;

public interface IMerchantService {
    public Merchant findById(int id);

    public void save(Merchant merchant);
}

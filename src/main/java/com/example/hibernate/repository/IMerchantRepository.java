package com.example.hibernate.repository;

import com.example.hibernate.entity.Merchant;

import java.util.List;

public interface IMerchantRepository {
    public Merchant findById(int id);
    public void save(Merchant merchant);
    public List<Merchant> getSortedByNeedToPay();}

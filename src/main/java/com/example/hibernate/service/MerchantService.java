package com.example.hibernate.service;

import com.example.hibernate.entity.Merchant;
import com.example.hibernate.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MerchantService implements IMerchantService {
    @Autowired
    private MerchantRepository merchantRepository;

    @Override
    public Merchant findById(int id) {
        return merchantRepository.findById(id);
    }

    @Override
    @Transactional
    public void save(Merchant merchant) {
        merchantRepository.save(merchant);
    }
}

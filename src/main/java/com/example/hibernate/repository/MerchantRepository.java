package com.example.hibernate.repository;

import com.example.hibernate.entity.Merchant;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MerchantRepository implements IMerchantRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Merchant findById(int id) {
        return em.find(Merchant.class, id);
    }

    @Override
    public void save(Merchant merchant) {
        em.persist(merchant);
    }
}

package com.example.hibernate.repository;

import com.example.hibernate.entity.Merchant;
import com.example.hibernate.entity.Result;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

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

    @Override
    public List<Merchant> getSortedByNeedToPay() {
        String txt = "SELECT m FROM merchant m ORDER BY m.needToSend";
        TypedQuery<Merchant> query = em.createQuery(txt, Merchant.class);
        return query.getResultList();
    }

    public List<Result> getTotalReport() {
        String txt = "SELECT new com.example.hibernate.entity.Result (p.merchant.name, SUM(p.chargePaid), count(p))";
        txt += "FROM payment p GROUP BY p.merchant.name";
        TypedQuery<Result> query = em.createQuery(txt, Result.class);
        return query.getResultList();
    }
}

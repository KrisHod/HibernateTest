package com.example.hibernate.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "dt")
    private java.sql.Date paymentDate;
    private String goods;
    @Column(name = "sumPaid")
    private Double sumPaid;
    @Column(name = "chargePaid")
    private Double chargePaid;
    @ManyToOne
    @JoinColumn(name = "merchantId")
    private Merchant merchant;

    public Payment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public Double getSumPaid() {
        return sumPaid;
    }

    public void setSumPaid(Double sumPaid) {
        this.sumPaid = sumPaid;
    }

    public Double getChargePaid() {
        return chargePaid;
    }

    public void setChargePaid(Double chargePaid) {
        this.chargePaid = chargePaid;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", paymentDate=" + paymentDate +
                ", goods='" + goods + '\'' +
                ", sumPaid=" + sumPaid +
                ", chargePaid=" + chargePaid +
                ", merchant=" + merchant +
                '}';
    }
}

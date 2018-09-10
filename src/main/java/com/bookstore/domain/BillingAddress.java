package com.bookstore.domain;

import javax.persistence.*;

@Entity
public class BillingAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  billingAddressName;
    private String  billingAddressgStreet1;
    private String  billingAddressgStreet2;
    private String  billingAddressCity;
    private String  billingAddressState;
    private String  billingAddressCountry;
    private String  billingAddressZipcode;


    @OneToOne
    private Order order;


    public BillingAddress() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBillingAddressName() {
        return billingAddressName;
    }

    public void setBillingAddressName(String billingAddressName) {
        this.billingAddressName = billingAddressName;
    }

    public String getBillingAddressgStreet1() {
        return billingAddressgStreet1;
    }

    public void setBillingAddressgStreet1(String billingAddressgStreet1) {
        this.billingAddressgStreet1 = billingAddressgStreet1;
    }

    public String getBillingAddressgStreet2() {
        return billingAddressgStreet2;
    }

    public void setBillingAddressgStreet2(String billingAddressgStreet2) {
        this.billingAddressgStreet2 = billingAddressgStreet2;
    }

    public String getBillingAddressCity() {
        return billingAddressCity;
    }

    public void setBillingAddressCity(String billingAddressCity) {
        this.billingAddressCity = billingAddressCity;
    }

    public String getBillingAddressState() {
        return billingAddressState;
    }

    public void setBillingAddressState(String billingAddressState) {
        this.billingAddressState = billingAddressState;
    }

    public String getBillingAddressCountry() {
        return billingAddressCountry;
    }

    public void setBillingAddressCountry(String billingAddressCountry) {
        this.billingAddressCountry = billingAddressCountry;
    }

    public String getBillingAddressZipcode() {
        return billingAddressZipcode;
    }

    public void setBillingAddressZipcode(String billingAddressZipcode) {
        this.billingAddressZipcode = billingAddressZipcode;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}

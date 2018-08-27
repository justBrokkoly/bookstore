package com.bookstore.service.impl;

import com.bookstore.domain.UserPayment;

public interface UserPaymentService {
    void removeById(Long creditCardId);

    UserPayment findById(Long id);
}

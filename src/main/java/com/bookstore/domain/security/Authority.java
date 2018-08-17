package com.bookstore.domain.security;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {
    private final String authoiry;

    public Authority(String authoiry) {
        this.authoiry = authoiry;
    }


    @Override
    public String getAuthority() {
        return authoiry;
    }
}

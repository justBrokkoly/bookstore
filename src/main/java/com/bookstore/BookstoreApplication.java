package com.bookstore;

import com.bookstore.domain.User;
import com.bookstore.domain.security.Role;
import com.bookstore.domain.security.UserRole;
import com.bookstore.service.impl.UserService;
import com.bookstore.utility.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setFirstName("Kirill");
        user1.setLastName("Kustov");
        user1.setUsername("jo");
        user1.setPassword(SecurityUtility.passwordEncoder().encode("jo"));
        user1.setEmail("kirinator322@gmail.com");
        Set<UserRole> userRoles = new HashSet<>();
        Role role =new Role();
        role.setRoleId(1);
        role.setName("ROLE_USER");
        userRoles.add(new UserRole(user1,role));

        userService.createUser(user1,userRoles);
    }
}

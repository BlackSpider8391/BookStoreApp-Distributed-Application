package com.devd.spring.bookstorebillingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-06-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}

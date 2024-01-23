package com.FaithMethods.AuthenticationSystem.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class RegistrationRequest {
    private final String firstName;
    private final String lastname;
    private final String email;
    private final String password;
}

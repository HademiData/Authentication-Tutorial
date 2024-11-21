package com.HademiPoint.Auth_service.auth;


import com.HademiPoint.Auth_service.Role.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String password;
    private Role role;
}

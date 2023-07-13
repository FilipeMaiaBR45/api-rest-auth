package com.example.apirest.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResquest {
    private  String firstname;
    private String lastname;
    private String email;
    private String password;
}

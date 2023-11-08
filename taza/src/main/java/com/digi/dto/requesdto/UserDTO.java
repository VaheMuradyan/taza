package com.digi.dto.requesdto;

import com.digi.enums.Role;
import lombok.Data;
import lombok.Getter;

@Data
public class UserDTO {
    private String name;
    private String surname;
    private Integer year;
    private String email;
    private String password;
    private Role role;
}

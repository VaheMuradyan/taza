package com.digi.controller;
import com.digi.dto.requesdto.UserDTO;
import com.digi.model.UserEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping
    public @ResponseBody UserEntity createUser(@RequestBody UserDTO userDTO){

    }
}

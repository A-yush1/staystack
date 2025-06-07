package com.staystack.backend.dto;

import com.staystack.backend.entity.User;
import com.staystack.backend.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}

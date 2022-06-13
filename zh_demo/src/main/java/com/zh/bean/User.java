package com.zh.bean;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private Integer uid;
    private String uname;
    private String pwd;
    private String phone;
}

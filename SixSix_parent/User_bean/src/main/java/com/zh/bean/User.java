package com.zh.bean;

import lombok.*;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private String nickname;
}

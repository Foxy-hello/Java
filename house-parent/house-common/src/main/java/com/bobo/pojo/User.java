package com.bobo.pojo;


import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description
 * @Author  Hunter
 * @Date 2022-05-23
 */

@Data
public class User  implements Serializable {

	private static final long serialVersionUID =  5516300957052189274L;
	private Long id;

	private String phone;

	private String password;

	private String salt;

}

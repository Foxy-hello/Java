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
public class City  implements Serializable {
	private static final long serialVersionUID =  4888086353444049417L;
	private Long id;

	private Long pid;

	private String name;

}

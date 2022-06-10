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

public class Shangquan  implements Serializable {

	private static final long serialVersionUID =  2864360653355572553L;

	/**
	 * 商圈
	 */
	private Long id;

	private String name;

	private Long cid;

}

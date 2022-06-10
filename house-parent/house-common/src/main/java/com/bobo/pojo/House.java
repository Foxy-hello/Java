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
public class House  implements Serializable {
	private static final long serialVersionUID =  4082979501997104944L;
	private Long id;
	private String name;
	private String picurl;
	private Long pid;
	private Long cid;
	private Long aid;
	private Double area;
	private String address;
	private Integer[] sids;//商圈ids

	private Integer num;//冗余字段 --数量

}

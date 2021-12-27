package com.bwie.ssm.service;

import java.util.List;

import com.bwie.ssm.pojo.Card;

/**
 * 用于批量操作的业务逻辑类
 * @author loupf
 *
 */
public interface BatchService {

	/**
	 * 批量还款
	 * @param 批量还款的cardid数组
	 * @throws Exception
	 */
	public void batch(int[] cardids);
}

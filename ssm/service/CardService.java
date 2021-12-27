package com.bwie.ssm.service;

import java.util.List;

import com.bwie.ssm.pojo.Card;

/**
 * 用于用户信用卡管理的业务逻辑类
 * @author loupf
 *
 */
public interface CardService {

	/**
	 * 单张卡还款
	 * @param cardId 还款账户
	 * @param money 还款金额
	 */
	public void repay(int cardId,double money);
}

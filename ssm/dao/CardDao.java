package com.bwie.ssm.dao;

import java.util.List;

import com.bwie.ssm.pojo.Card;

public interface CardDao {
	/**
	 * 还款
	 * @param cardId 卡号
	 * @param money 金额
	 */
	public void repay(int cardId ,double money);

}

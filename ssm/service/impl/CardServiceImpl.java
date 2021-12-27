package com.bwie.ssm.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.bwie.ssm.dao.CardDao;
import com.bwie.ssm.pojo.Card;
import com.bwie.ssm.service.CardService;

@Service("cardService")
public class CardServiceImpl implements CardService {

	@Autowired
	@Qualifier("cardDao")
	private CardDao cardDao;

	@Override
	public void repay(int cardId, double money) {// 单卡还款
		////@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.DEFAULT)
			cardDao.repay(cardId, money);
			if (cardId == 3) {
				throw new RuntimeException();//Spring默认会对运行时异常进行事务回滚,不要try catch
			}
	}

}

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
import com.bwie.ssm.service.BatchService;
import com.bwie.ssm.service.CardService;

@Service("batchService")
public class BatchServiceImpl implements BatchService {

	@Autowired
	private CardDao cardDao;

	@Autowired
	private CardService cardService;

	@Override
	public void batch(int[] cardids) {
		////@Transactional  //支持事务v
		for(int cardId:cardids){
			System.out.println(cardId+"=3434====cardId==========");
			cardService.repay(cardId, 1000);//假设都还1000元
		}
		System.out.println("========3434========batchend");
	}
	
	@Transactional
	public void test(){
		
	}
	 
}

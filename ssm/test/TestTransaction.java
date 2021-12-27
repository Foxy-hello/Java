package com.bwie.ssm.test;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bwie.ssm.service.BatchService;
import com.bwie.ssm.service.CardService;
import com.bwie.ssm.service.impl.CardServiceImpl;

public class TestTransaction {
	private final Logger log = LoggerFactory.getLogger(CardServiceImpl.class);
	@Test
	public void testTransferAccounts(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		BatchService batchService = (BatchService) context.getBean("batchService");
		int[] cardIds = new int[]{1,2,3,4};
		batchService.batch(cardIds);
	}
}

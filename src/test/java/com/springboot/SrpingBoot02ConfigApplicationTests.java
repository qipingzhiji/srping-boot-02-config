package com.springboot;

import com.springboot.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SrpingBoot02ConfigApplicationTests {

	@Autowired
	private Person person;

	@Autowired
	private ApplicationContext act;

	@Test
	public void containsBean() {
		boolean userService = act.containsBean("userService");
		boolean helloService02 = act.containsBean("helloService02");
		System.out.println(userService);
		System.out.println(helloService02);
	}

	@Test
	public void contextLoads() {
		System.out.println(person.toString());
	}
    @Test
	public  void logTest() {
		Logger logger = LoggerFactory.getLogger(getClass());
		logger.trace("这是一个trace日志记录");
		logger.info("这是一个info日志记录");
	}

}

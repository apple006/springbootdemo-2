package com.chenquan;

import com.chenquan.dao.UserDAO;
import com.chenquan.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {
	
	@Autowired
	private UserDAO userDAO; 
	
	
	@Test
	public void contextLoads() {
		User u=userDAO.selectByPrimaryKey(1);
		System.out.print(u.toString());
	}

}

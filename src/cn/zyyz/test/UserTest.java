package cn.zyyz.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zyyz.mapper.UserMapper;
import cn.zyyz.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/config/spring-common.xml")
public class UserTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testAdd(){
		User user = new User(-1, "23", "jiuqiyuliang");
		userMapper.save(user);
		
	}
	
	@Test
	public void testFindAll(){
		List<User> findAllList = userMapper.findAll();
		for(User u:findAllList){
			System.out.println(u.getUser_id()+":"+u.getUser_name());
		}
		System.out.println(findAllList.size());
	}
	

	@Test
	public void testDelete(){
		userMapper.delete(1);
	}
	
	@Test
	public void testFindById(){
		User user = userMapper.findById(2);
		System.out.println(user.getUser_id());
		System.out.println(user.getUser_name());
	}


	@Test
	public void testUpdate(){
		
		User user = new User(2, "23", "yuliang");
		userMapper.update(user);
	}

}

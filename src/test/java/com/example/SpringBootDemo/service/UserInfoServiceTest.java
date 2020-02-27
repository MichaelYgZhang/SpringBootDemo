package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.SpringbootexampleApplicationTests;
import com.example.SpringBootDemo.bean.UserInfo;
import com.example.SpringBootDemo.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

public class UserInfoServiceTest extends SpringbootexampleApplicationTests {

	@Autowired
	private UserInfoService userInfoService;

	@Test
	public void testFindAll() {
		final List<UserInfo> userInfoList = userInfoService.findAll();
		assert userInfoList.isEmpty() == false;
	}

	@Test
	public void testDeleteById() {
		final Boolean flag = userInfoService.deleteById(1L);
		assert flag == false;
	}

}

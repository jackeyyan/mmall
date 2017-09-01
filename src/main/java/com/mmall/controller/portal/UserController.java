package com.mmall.controller.portal;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author yanyo
 *
 */
@Controller
@RequestMapping("/user/")
public class UserController {
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @param seesion
	 * @return
	 */
	@RequestMapping(value="login.do",method=RequestMethod.POST)
	@ResponseBody
	public Object login(String username, String password, HttpSession seesion){
		//service-->mybatis-->dao
		return null;
	}

}

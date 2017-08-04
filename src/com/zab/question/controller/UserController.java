package com.zab.question.controller;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.zab.question.exception.NameErrorException;
import com.zab.question.exception.NameExistException;
import com.zab.question.exception.PassWordErrorException;
import com.zab.question.modle.User;
import com.zab.question.service.UserService;
import com.zab.question.util.VerifyCodeUtils;

@Controller
@RequestMapping(value = "/user", produces = "application/json;charset=utf-8")
public class UserController {
	@Resource
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/updataPwd", method=RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> updataPassWord(
			@ModelAttribute("name") String name,
			@ModelAttribute("oldPwd") String oldPwd,
			@ModelAttribute("newPwd") String newPwd) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		try {
			int u = userService.updataPassWord(name, oldPwd, newPwd);
			if(u>0){
				map.put("error", 200);
				map.put("result", "success");
				map.put("msg", "success");
			}else{
				map.put("error", 100001);
				map.put("result", "fail");
				map.put("msg", "Î´Öª´íÎó");
			}
			
		} catch (NameErrorException e) {
			map.put("error", 20001);
			map.put("result", "fail");
			map.put("msg", e.getMessage());
			e.printStackTrace();
		} catch (PassWordErrorException e) {
			map.put("error", 20002);
			map.put("result", "fail");
			map.put("msg", e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {
			map.put("error", 10000);
			map.put("result", "fail");
			map.put("msg", "System error");
			e.printStackTrace();
		}

		return map;
	}

	@RequestMapping(value = "/imageCode", produces = "application/json;charset=utf-8")
	@ResponseBody
	public void getImageCode(HttpSession session, HttpServletResponse response) {
		try {
			String code = VerifyCodeUtils.generateVerifyCode(6);
			session.setAttribute("code", code);
			ServletOutputStream os = response.getOutputStream();
			VerifyCodeUtils.outputImage(200, 80, os, code);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@RequestMapping(value = "/regist", method = { RequestMethod.POST })
	@ResponseBody
	public HashMap<String, Object> regist(@ModelAttribute("name") String name,
			@ModelAttribute("pwd") String pwd) {
		System.out.println(name + ":" + pwd);
		HashMap<String, Object> map = new HashMap<String, Object>();
		if ("".equals(name) || "".equals(pwd)) {
			map.put("error", 2008);
			map.put("msg", "paramy is not null!");
			return map;
		}
		try {
			User u = userService.regist(name, pwd);
			map.put("result", "success");
			map.put("msg", u.getU_name());
		} catch (NameExistException e) {
			map.put("result", "fail");
			map.put("msg", e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			map.put("result", "fail");
			map.put("msg", "System error");
		}
		return map;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> login(@ModelAttribute("name") String name,
			@ModelAttribute("pwd") String pwd,
			@ModelAttribute("code") String code, HttpSession session) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		String sCode = (String) session.getAttribute("code");

		if (sCode == null || !sCode.equalsIgnoreCase(code)) {
			map.put("error", "500");
			map.put("result", "fail");
			map.put("msg", "code is ´íÎó");
			return map;
		}

		if (name == null || pwd == null) {
			map.put("result", "fail");
			map.put("error", 2008);
			map.put("msg", "paramy is not null!");
			return map;
		}
		try {
			User u = userService.login(name, pwd);
			map.put("result", "success");
			map.put("msg", u.getU_name());
		} catch (NameErrorException e) {
			map.put("result", "fail");
			map.put("msg", e.getMessage());
		} catch (PassWordErrorException e) {
			map.put("result", "fail");
			map.put("msg", e.getMessage());
		} catch (Exception e) {
			map.put("result", "fail");
			map.put("msg", "System error");
		}
		return map;
	}

}

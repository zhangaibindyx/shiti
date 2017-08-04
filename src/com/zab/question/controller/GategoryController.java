package com.zab.question.controller;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zab.question.modle.Category;
import com.zab.question.service.GategoryServcie;

@Controller
@RequestMapping(value = "/question", produces = "application/json;charset=utf-8")
public class GategoryController {
	@Resource
	private GategoryServcie gategoryServie;

	public GategoryServcie getGategoryServie() {
		return gategoryServie;
	}

	public void setGategoryServie(GategoryServcie gategoryServie) {
		this.gategoryServie = gategoryServie;
	}

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	@ResponseBody
	public String findAllCategory() {
		List<Category> gategorys = gategoryServie.findAll();
		JSONArray arry = JSONArray.fromObject(gategorys);
		System.out.println(arry.toString());
		return arry.toString();

	}

}

package com.zab.question.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zab.question.exception.SAQuestionExistException;
import com.zab.question.modle.SAQuestion;
import com.zab.question.service.SubjectService;

@Controller
@RequestMapping(value = "/subject")
public class SubjectController {

	@Resource
	private SubjectService subjectService;

	public SubjectService getSubjectService() {
		return subjectService;
	}

	public void setSubjectService(SubjectService subjectService) {
		this.subjectService = subjectService;
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> insertSubject(
			@PathVariable("title") String title,
			@PathVariable("content") String content,
			@PathVariable("answer") String answer,
			@PathVariable("type") String type,
			@PathVariable("level") String level) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if (title == null || content == null || answer == null || type == null
				|| answer == null || level == null) {
			map.put("error", 2001);
			map.put("result", "fail");
			map.put("msg", "pamar is not null");
			return map;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-mm-dd HH-MM-ss");
		String time = sdf.format(new Date(System.currentTimeMillis()));
		SAQuestion saq = new SAQuestion();
		saq.setQ_text(content);
		saq.setT_title(title);
		saq.setAns_answer(answer);
		saq.setL_id(Integer.parseInt(level));
		saq.setQ_time(time);
		saq.setT_id(type);
		try {
			subjectService.insertSubject(saq);
			map.put("error", 200);
			map.put("result", "success");
			map.put("msg", "success");
		} catch (SAQuestionExistException e) {
			map.put("error", 2001);
			map.put("result", "fail");
			map.put("msg", "saquestion is exist ");
			e.printStackTrace();
		} catch (Exception e) {
			map.put("error", 500);
			map.put("result", "fail");
			map.put("msg", "System error");
			e.printStackTrace();
		}
		return map;
	}
}

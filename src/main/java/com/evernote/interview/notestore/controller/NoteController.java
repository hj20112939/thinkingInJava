package com.evernote.interview.notestore.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.evernote.interview.notestore.entity.NoteDetail;
import com.evernote.interview.notestore.service.NoteService;
import com.sun.istack.internal.logging.Logger;

/**
 * 
 * @author hj 笔记管理controller类
 */
@Controller
@RequestMapping("note")
public class NoteController {
	Logger log = Logger.getLogger(NoteController.class);
	@Autowired
	private NoteService noteService;

	/**
	 * 获取所有的笔记标题列表
	 * 
	 * @return 笔记标题列表
	 */
	@RequestMapping("getAllNote")
	@ResponseBody
	public List<Map<String, String>> getAllNote(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			return noteService.getAllNote();
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		return doExceptionEvent();
	}

	/**
	 * 获取指定笔记本中的笔记标题列表
	 * 
	 * @param guid
	 * @return 指定笔记本中的笔记标题列表
	 */
	@RequestMapping("getNoteListByNoteBookId")
	@ResponseBody
	public List<Map<String, String>> getNoteListByNoteBookId(
			HttpServletRequest request, HttpServletResponse response) {
		String guid = request.getParameter("noteId");
		try {
			return noteService.getNoteListByNoteBookId(guid);
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		return doExceptionEvent();
	}

	/**
	 * 获取笔记本名字列表
	 */
	@RequestMapping("getNoteBooks")
	@ResponseBody
	public List<Map<String, String>> getNoteBooks(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			return noteService.getNoteBooks();
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		return doExceptionEvent();
	}

	/**
	 * 获取笔记信息
	 */
	@RequestMapping("getNoteById")
	public ModelAndView getNoteById(HttpServletRequest request,
			HttpServletResponse response) {
		String guid = request.getParameter("noteId");
		NoteDetail noteDetail = new NoteDetail();
		try {
			noteDetail = noteService.getNoteById(guid);
		} catch (Exception e) {
			noteDetail.setTitle("出错了");
			noteDetail.setContent("出错了");
			log.info(e.getMessage());
		}
		String noteContent = JSON.toJSONString(noteDetail);
		ModelAndView model = new ModelAndView("page/notecontent");
		model.addObject("noteContent", noteContent);
		return model;
	}

	/**
	 * 异常时返回数据处理方法
	 * 
	 * @return errorInfo异常信息
	 */
	private List<Map<String, String>> doExceptionEvent() {
		List<Map<String, String>> errorInfo = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "出错了");
		map.put("name", "出错了");
		errorInfo.add(map);
		return errorInfo;
	}
}

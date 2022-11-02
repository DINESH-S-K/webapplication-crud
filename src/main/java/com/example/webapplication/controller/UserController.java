package com.example.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.webapplication.dao.UserDAO;
import com.example.webapplication.model.UserData;

@Controller
public class UserController {

	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("index")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("addUser")
	public String addUser(UserData userData) {
		userDAO.save(userData);
		return "index.jsp";
	}
	
	@RequestMapping("getUser")
	public ModelAndView getUser(@RequestParam int id) {
		ModelAndView mav =new ModelAndView("showUser.jsp");
		
		UserData userData = userDAO.findById(id).orElse(new UserData()); // orElse method useful
		//when a user enter a wrong id it will return null object
		
		//otherwise we will create a  new UserData object
//		UserData userData = userDAO.findById(id).orElse(new UserData());
		
		mav.addObject(userData);
		
		return mav;
	
	}
	
	@RequestMapping("updateUser")
	public ModelAndView updateUser(UserData userData) {
		ModelAndView mav =new ModelAndView("updateUser.jsp");
		
		userData = userDAO.findById(userData.getId()).orElse(new UserData()); // orElse method useful
		//when a user enter a wrong id it will return null object
		
		//otherwise we will create a  new UserData object
//		UserData userData = userDAO.findById(id).orElse(new UserData());
		userDAO.deleteById(userData.getId());
		
		mav.addObject(userData);
		
		return mav;
	}
	
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam int id) {
		ModelAndView mav =new ModelAndView("deleteUser.jsp");
		
		UserData userData = userDAO.findById(id).orElse(new UserData()); // orElse method useful
		//when a user enter a wrong id it will return null object
		
		//otherwise we will create a  new UserData object
//		UserData userData = userDAO.findById(id).orElse(new UserData());
		userDAO.deleteById(id);
		
		mav.addObject(userData);
		
		return mav;
	}
}


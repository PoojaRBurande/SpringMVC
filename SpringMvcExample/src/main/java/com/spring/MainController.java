package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value="/home")
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		System.out.println("home");
		return model;
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		//mav.addObject("login", new Login());
		System.out.println("login");
		return mav;
	}
	@RequestMapping(value="/add",method = RequestMethod.GET)
	public ModelAndView AddInputs(@RequestParam("input1" ) String input1){
		ModelAndView model = new ModelAndView();
		model.setViewName("result");
		
		String Message="Yo did it";
		model.addObject(Message, Message);
		
		return model;
		
	}
	

    @RequestMapping(value = "/validateLogin", method = RequestMethod.GET)
	public ModelAndView loginInto(HttpServletRequest request, HttpServletResponse response) {
		boolean isUser=false;
		ModelAndView mav=null;
		String message="Invalid userId or Password";
		
		/*try {
			isUser=loginDao.checkUser(request.getParameter("id"),request.getParameter("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		if(isUser)
		 mav = new ModelAndView("welcome");
		//mav.addObject("login", new Login());
		else
			mav = new ModelAndView("login");	
			mav.addObject(message, message);
		System.out.println("test");
		return mav;
	}
}

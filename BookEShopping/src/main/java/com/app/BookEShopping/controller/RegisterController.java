package com.app.BookEShopping.controller;





import java.text.SimpleDateFormat;





import java.util.Date;

import java.util.Locale;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.propertyeditors.CustomDateEditor;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.app.BookEShopping.RegisterClass;
import com.app.BookEShopping.dao.RegisterClassService;



@Controller

public class RegisterController {



	@Autowired

	RegisterClassService service;



	// @InitBinder

	// protected void initBinder(WebDataBinder binder) {

	// SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	// binder.registerCustomEditor(Date.class, new CustomDateEditor(

	// dateFormat, false));

	// }

	@InitBinder

	public final void initBinderUsuariosFormValidator(final WebDataBinder binder, final Locale locale) {

		final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd", locale);

		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));

	}



	@RequestMapping(value = "/registeruser", method = RequestMethod.GET)

	public String showUserRegisterPage(@ModelAttribute("registerclass") RegisterClass registerclass, ModelMap model) {

		// String u=service.generateuserId();

		registerclass = new RegisterClass();

		model.put("userId", service.generateuserId());
		model.put("category","customer");

		return "register";

	}
	
	@RequestMapping(value = "/registeradmin", method = RequestMethod.GET)

	public String showAdminRegisterPage(@ModelAttribute("registerclass") RegisterClass registerclass, ModelMap model) {

		// String u=service.generateuserId();

		registerclass = new RegisterClass();

		model.put("userId", service.generateuserId());
		model.put("category","admin");

		return "register";

	}




	@RequestMapping(value = "/register", method = RequestMethod.POST)

	public String showWelcomepage(@ModelAttribute("registerclass") RegisterClass registerclass, ModelMap model,

			BindingResult result) {

		// String u=service.generateuserId();


		Date d = registerclass.getDob();

		

//		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  

//	    String date= formatter.format(d);  

	    java.sql.Date sqldate = new java.sql.Date(d.getTime());

		boolean registered=service.adddata(registerclass.getFirstName(), registerclass.getLastName(), sqldate, registerclass.getGender(),

				registerclass.getContactNo(), registerclass.getEmail(), registerclass.getUserCategory(),

				registerclass.getUserId(), registerclass.getPassword(), registerclass.getPetname(), registerclass.getFavteachername(),registerclass.getSchoolname());

		if(registered==true){
			model.put("msg","Your details are submitted successfully");
		}
		else{
			model.put("msg", "some error occured");
		}
		
		return "register";
		
		

	}



}

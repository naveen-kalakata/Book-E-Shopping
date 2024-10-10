package com.app.BookEShopping.controller;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
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

import com.app.BookEShopping.HelpClass;
import com.app.BookEShopping.dao.HelpClassService;


@Controller
public class HelpController
{
	@Autowired
	HelpClassService service;
	@InitBinder

	public final void initBinderUsuariosFormValidator(final WebDataBinder binder, final Locale locale) {

		final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd", locale);

		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));

	}
@RequestMapping(value = "/help", method = RequestMethod.GET)

// @ResponseBody

public String showHelpPage(@ModelAttribute("helpclass") HelpClass helpclass, ModelMap model) {

	helpclass = new HelpClass();
	model.put("helpId", service.generaterequestId());
return "help";

}


@RequestMapping(value = "/help", method = RequestMethod.POST)

public String showWelcomepage(@ModelAttribute("helpclass") HelpClass helpclass, ModelMap model,

		BindingResult result) {

	// String u=service.generateuserId();


	Date d = helpclass.getDateofticket();

	

//	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  

//    String date= formatter.format(d);  

    java.sql.Date sqldate = new java.sql.Date(d.getTime());

	boolean registered=service.adddata(sqldate,helpclass.getHelpId(), helpclass.getContactNo(), helpclass.getIssue());

	if(registered==true){
		model.put("m2","Issue raised successfully");
	}
	else{
		model.put("m2", "some error occured");
	}
	
	return "help";
	
	

}



}

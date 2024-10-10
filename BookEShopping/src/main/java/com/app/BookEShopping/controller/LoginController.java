package com.app.BookEShopping.controller;



import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import com.app.BookEShopping.dao.BookDetailsdao;
import com.app.BookEShopping.dao.RegisterClassService;



@Controller

public class LoginController {
	
	
	@RequestMapping(value = "/bookeshopping", method = RequestMethod.GET)
	public String showwelcomePage() {

		return "welcome";

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {

		//return "login";
		return "welcome";

	}
	
	@RequestMapping(value = "/adminhome", method = RequestMethod.GET)
	public String showAdminHome(ModelMap model) {
		
		BookDetailsdao dao=new BookDetailsdao();
		String c=dao.dynamicstockupdation();
		model.put("data", c);

		return "adminfirstpage";

	}
//	//
//	@RequestMapping(value = "/custhome", method = RequestMethod.GET)
//	public String showCustHome(ModelMap model) {
//		//model.put("userid", userid);
//		return "customerfirstpage";
//
//	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)

	public String handleLoginPage(ModelMap model, @RequestParam String userid, @RequestParam String pswrd){

		

		RegisterClassService service=new RegisterClassService();

		String category=service.LoginValidation(userid,pswrd);

		System.out.println(category);

		if(category.equals("customer")){
			model.put("userid", userid);

			return "customerfirstpage";

		}

		else if(category.equals("admin")){
			
			BookDetailsdao dao=new BookDetailsdao();
			String c=dao.dynamicstockupdation();
			model.put("u", userid);
			model.put("data", c);

			return "adminfirstpage";

		}

		else{

			model.put("errorMessage", "Invalid Credentials");

			return "login";

		}

		



		

		

	}

	@RequestMapping(value = "/forgotpassword", method = RequestMethod.GET)

	public String showforgotpassword(){

		return "forgotpassword";

	}

	@RequestMapping(value = "/forgotpassword", method = RequestMethod.POST )

	public String updateforpassword(@RequestParam String userid, @RequestParam String petname,@RequestParam String favteachername, @RequestParam String schoolname, @RequestParam String pass){

		RegisterClassService cs=new RegisterClassService();

		try {
			if((cs.updatepassword(userid, petname, favteachername, schoolname,pass))==true){

				return "updated";

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "notexist";

	}

	@RequestMapping(value = "/forgotuserid", method = RequestMethod.GET)

	public String showforgotuserid(){

		return "forgotuserid";

	}

	@RequestMapping(value = "/forgotuserid", method = RequestMethod.POST )

	public String displayuserid(ModelMap model, @RequestParam String number, @RequestParam String petname,@RequestParam String favteachername, @RequestParam String schoolname, @RequestParam String email){

		RegisterClassService rcs=new RegisterClassService();

		String userid=rcs.returnuserid(number, petname, favteachername, schoolname,email);

		if(userid=="wrong"){

			model.put("id","wrong data entered");

		}

		else{

			model.put("id",userid);

		}

		return "forgotuserid";

	}

	

}

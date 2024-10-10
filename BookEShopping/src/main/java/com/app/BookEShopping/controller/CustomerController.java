package com.app.BookEShopping.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import com.app.BookEShopping.AddToCart;
import com.app.BookEShopping.BookDetails;
import com.app.BookEShopping.dao.BookDetailsdao;

@Controller

public class CustomerController

{
	
	@InitBinder

	public final void initBinderUsuariosFormValidator(final WebDataBinder binder, final Locale locale) {

		final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd", locale);

		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));

	}

	// @RequestMapping(value="/customerfirstpage", method = RequestMethod.GET)

	// public String showcustomerfirstPage(ModelMap model){

	//// model.put("name", name);

	// return "customerfirstpage";

	// }

	@RequestMapping(value = "/resourceList", method = RequestMethod.GET)

	public String showResourceListPage(ModelMap model,@RequestParam String userid) {
		
		 model.put("userid", userid);
		 System.out.println(userid);

		return "resourceList";

	}

	@RequestMapping(value = "/addtocart", method = RequestMethod.GET)

	public String addcart(@RequestParam String booknameandid, ModelMap model,@ModelAttribute("addtocart")AddToCart addtocart) {
		addtocart=new AddToCart();
		BookDetailsdao bookdetails = new BookDetailsdao();
		
		String[] bknmeandid=booknameandid.split(",");

		String[] a = (bookdetails.sendbookpriceaddtocart(bknmeandid[0])).split(",");
		
		model.put("userid", bknmeandid[1]);

		model.put("n", bknmeandid[0]);
		model.put("p", a[0]);
		model.put("m", a[1]);
		//model.put("userid", userid)
		return "addtocart";

	}
	
	@RequestMapping(value = "/addtocart", method = RequestMethod.POST)

	public String processtopayment(@ModelAttribute("addtocart")AddToCart addtocart, BookDetails b,ModelMap model,BindingResult result) {
		BookDetailsdao bookdetails = new BookDetailsdao();
		bookdetails.addtocartdatabase(addtocart.getUserid(), addtocart.getBookname(), addtocart.getBookprice(), addtocart.getQuanity(), addtocart.getRentbuy(), addtocart.getDeliveryAddress());
		
		//bookdetails.addtocartdatabase(addtocart.getUserid(),addtocart.getBookname(), addtocart.getBookprice(), addtocart.getQuanity(), addtocart.getRentbuy(), addtocart.getDeliveryAddress());
		model.put("userid", addtocart.getUserid());
		model.put("bookname", addtocart.getBookname());
		model.put("quan", addtocart.getQuanity());
		model.put("price", addtocart.getBookprice()*addtocart.getQuanity());
		return "processtopayment";

	}
	
	@RequestMapping(value = "/order", method = RequestMethod.POST)

	public String order(@RequestParam String userid,@RequestParam String bookname,@RequestParam String cardnumber,@RequestParam String cvv,@RequestParam Date date,@RequestParam int quan, ModelMap model) {
		BookDetailsdao bookdetails = new BookDetailsdao();

		System.out.println(date);

		java.sql.Date sql = new java.sql.Date(date.getTime());
		System.out.println(sql);
		
		bookdetails.addcarddetails(bookname,cardnumber, cvv, sql);
		bookdetails.ordered(bookname,quan);
		bookdetails.updatestatustopackaging(userid, bookname);
		model.put("message", "Your Order is successful");
		
		return "processtopayment";

	}
	
	@RequestMapping(value="/searchbook", method = RequestMethod.POST)
	public String showSearchBookPage(ModelMap model){
	//model.put("name", name);
	return "searchbook";
	}
	


}
package com.app.BookEShopping.controller;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.BookEShopping.BookDetails;
import com.app.BookEShopping.HelpClass;
import com.app.BookEShopping.dao.BookDetailsdao;

@Controller
public class AdminController {
	
	
	@RequestMapping(value = "/addresoures", method = RequestMethod.GET)
	public String showadminfirstPage(@ModelAttribute("bookdetails") BookDetails bookdetails, ModelMap model)
	{
		bookdetails = new BookDetails();
		return "addresoures";
	}


	@RequestMapping(value = "/addbookdetails", method = RequestMethod.POST)
	public String addbookPage(@ModelAttribute("bookdetails") BookDetails bookdetails, ModelMap model,
			BindingResult result) {
		// String u=service.generateuserId();
		BookDetailsdao service=new BookDetailsdao();
				System.out.println("inside this add book");
		service.addbookdata(bookdetails.getBookName(),bookdetails.getBookCode(), bookdetails.getBookDesc(),
				bookdetails.getAuthor(), bookdetails.getBookcategory(), bookdetails.getBooktype(),
				bookdetails.getBuyingoption(), bookdetails.getBookrate(),bookdetails.getDiscount(),bookdetails.getNoofcopiesavailable(),bookdetails.getNoofcopiessold(),bookdetails.getNoofcopiesreturned(),bookdetails.getBookpreview());
		model.put("msg", "BOOK DETAILS ADDED SUCCESSFULLY");
		return "addresoures";
	}
	
	@RequestMapping(value = "/showbookdetails", method = RequestMethod.GET)
	public String showBookDetails(@ModelAttribute("bookdetails") BookDetails bookdetails, ModelMap model,
			BindingResult result) {
		
	 return "showbookdetails";
	}

	@RequestMapping(value = "/showbook", method = RequestMethod.GET)
	public String updatebookdetails(@RequestParam String bookcode, ModelMap model) {
		BookDetailsdao dao=new BookDetailsdao();
		BookDetails book=dao.searchbookbycode(bookcode);
		model.put("bookcode", bookcode);
		model.put("rate", book.getBookrate());
		model.put("dis", book.getDiscount());
		model.put("available", book.getNoofcopiesavailable());
		model.put("return", book.getNoofcopiesreturned());
		
	 return "updatebook";
	}
	@RequestMapping(value = "/uphelp", method = RequestMethod.GET)
	public String updatehelp(@RequestParam String helpid, ModelMap model) {
		BookDetailsdao dao=new BookDetailsdao();
		HelpClass help=dao.searchissuebycode(helpid);
		model.put("helpid", helpid);
		model.put("status", help.getIssue());
		
	 return "updatehelp";
	}
	// /
	@RequestMapping(value = "/updatebookdetails", method = RequestMethod.POST)
	public String bookupdated(@RequestParam String bookcode,@RequestParam String rate,@RequestParam String dis,@RequestParam String available,
			@RequestParam String returned, ModelMap model) {
		// String u=service.generateuserId();
		BookDetailsdao service=new BookDetailsdao();
		service.bookupdate(bookcode,rate,dis,available,returned);
		model.put("msg", "The Book Details Updated Successfully");
		return "updatebook";
	}
	@RequestMapping(value = "/updatehelp", method = RequestMethod.GET)
	public String uphelp(@RequestParam String helpid,@RequestParam String update, ModelMap model) {
		// String u=service.generateuserId();
		BookDetailsdao service=new BookDetailsdao();
		service.updatehelp(helpid,update);
		model.put("msg", "Issue updated");
		return "updatehelp";
	}
	// /
	@RequestMapping(value = "/seeallordersinadmin", method = RequestMethod.GET)
	public String seeallordersplaces( ModelMap model) {
		
	 return "seeallordersinadmin";
	}
	@RequestMapping(value="/updateissue",method=RequestMethod.GET)
	public String updateissue(@RequestParam String status,ModelMap model){
		
		String[] s=status.split(",");
		model.put("status",s[0]);
		//model.put("bookname",s[1]);
		model.put("helpid",s[2]);
		return "updatehelp";
	}
	@RequestMapping(value="/updatestatus",method=RequestMethod.GET)
	public String updatestatus(@RequestParam String status,ModelMap model){
		
		String[] s=status.split(",");
		model.put("status",s[0]);
		model.put("bookname",s[1]);
		model.put("userid",s[2]);
		return "updatestatus";
	}
	// /
	@RequestMapping(value="/updatetrack",method=RequestMethod.POST)
	public String updatetrack(@RequestParam String userid,@RequestParam String name,@RequestParam String status,ModelMap model){
		BookDetailsdao dao=new BookDetailsdao();
		dao.updatestatus(userid,name,status);
		model.put("msg","updated");
		return "updatestatus";
	}
	@RequestMapping(value="/archieve",method=RequestMethod.GET)
	public String archieve(@RequestParam String bookcode,ModelMap model){
		BookDetailsdao dao=new BookDetailsdao();
		dao.archievebook(bookcode);
		model.put("msg", "Archieved");
		return "showbookdetails";
	}
	// unarchieve
	@RequestMapping(value="/unarchieve",method=RequestMethod.GET)
	public String unarchieve(@RequestParam String bookcode,ModelMap model){
		BookDetailsdao dao=new BookDetailsdao();
		dao.unarchievebook(bookcode);
		model.put("msg", "UNArchieved");
		return "showbookdetails";
	}

	@RequestMapping(value = "/seefeedback", method = RequestMethod.GET)
	public String showSeeFeedbackPage()
	{
	return "seefeedback";
	}
	@RequestMapping(value = "/seehelp", method = RequestMethod.GET)
	public String showSeeHelpPage()
	{
	return "seehelp";
	}
	
	
	
	
	

}
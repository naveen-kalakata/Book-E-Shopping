package com.app.BookEShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ResourceListController 
{
//@RequestMapping(value="/customerfirstpage", method = RequestMethod.GET)
//public String showcustomerfirstPage(ModelMap model){
////model.put("name", name);
//return "customerfirstpage";
//}

@RequestMapping(value="/categoryResList", method = RequestMethod.POST)
public String showcategoryResListPage(ModelMap model ,@RequestParam String bookscat){
	
model.put("bookscat", bookscat);
return "categoryResList";
}

@RequestMapping(value="/sortResList", method = RequestMethod.POST)
public String showsortResListPage(ModelMap model,@RequestParam String books,@RequestParam String bookscat){
//model.put("name", name);
	if(books.equals("sortbytitlea")){
		return "sorttitleatoz";
		
	}else if(books.equals("sortbytitlez")){
		return "sorttitleztoa";
	}else if(books.equals("sortbyauthora")){
		return "sortauthoratoz";
	}else{
		return "sortauthorztoa";
	}
}


}



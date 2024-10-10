package com.app.BookEShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.BookEShopping.dao.FeedbackClassService;


@Controller
public class FeedbackController 
{
@RequestMapping(value = "/customerfeedback", method = RequestMethod.GET)

// @ResponseBody

public String showCustomerFeedbackPage() {

return "customerfeedback";

}


@RequestMapping(value = "/customerfeedback", method = RequestMethod.POST)

// @ResponseBody

public String handleCustomerFeedbackPage(ModelMap model, @RequestParam String username, @RequestParam String contactno, @RequestParam String feedback) 
{

FeedbackClassService service = new FeedbackClassService();
service.review(username,contactno,feedback);
model.put("m1", "Feedback submitted successfully");

return "customerfeedback";

}
}
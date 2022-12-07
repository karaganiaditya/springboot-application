package com.example.CalculatorSpring.AddController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.CalculatorSpring.domain.Addition;

@Controller
/*
 * The @Controller annotation indicates that a particular class serves the role
 * of a controller. Spring Controller annotation is typically used in
 * combination with annotated handler methods based on the @RequestMapping
 * annotation
 */
public class AdditionController 
{
	@GetMapping("/index") 
	/*
	 * The GET HTTP request is used to get a single or multiple resources
	 * and @GetMapping annotation for mapping HTTP GET requests onto specific
	 * handler methods. Specifically, @GetMapping is a composed annotation that acts
	 * as a shortcut for  @RequestMapping(method = RequestMethod.
	 */
	public String ViewForm(Model model)
	{
		model.addAttribute("Addition", new Addition());
		return "index";
	}
	
	@PostMapping("/addition")
	/*
	 * @PostMapping annotation maps HTTP POST requests onto specific handler
	 * methods.
	 */
	public String addForm(@ModelAttribute Addition addition,BindingResult result,Model model)
	{
	model.addAttribute("addition",addition);
	return "calculate";
	}
}

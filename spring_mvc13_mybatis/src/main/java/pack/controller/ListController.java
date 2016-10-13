package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pack.model.DataInter;



//10.10-3-4130
@Controller
@ComponentScan("pack.model")
public class ListController {
	
	@Autowired
	private DataInter inter;	
	//10.10-3-5200 both
	@RequestMapping("list")
	public Model processSelect(Model model){
		System.out.println("ListController");
		model.addAttribute("data", inter.list());
		return model;
	}
	
	
}

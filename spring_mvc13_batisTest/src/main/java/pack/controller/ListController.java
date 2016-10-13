package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pack.model.SawonDto;
import pack.model.SawonInter;

@Component
@ComponentScan("pack.model")
public class ListController {

	@Autowired
	private SawonInter inter;
	
//	@RequestMapping("list")
//	public ModelAndView getDataAll(){
//		System.out.println("ListController.this.getDataAll()");
//		List<SawonDto> list = inter.selectList();
//		
//		return new ModelAndView("list", "lists", list);
//		
//	}
	@RequestMapping(value="list", method= RequestMethod.GET)
	public Model processSelect(Model model){
		System.out.println("ListController.this.getDataAll()");
//		List<SawonDto> list = inter.selectList();
		model.addAttribute("lists", inter.selectList());
		return model;
		
	}
	
	
}

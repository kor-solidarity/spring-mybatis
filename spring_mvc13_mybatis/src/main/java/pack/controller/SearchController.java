package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pack.model.DataInter;
import pack.model.SangpumDto;

@Controller
public class SearchController {
	//10.10-4-2
	@Autowired
	private DataInter inter;
	
	@RequestMapping(value="search", method=RequestMethod.POST)
	public ModelAndView processSearch(SangpumBean bean){
		System.out.println("SearchController.processSearch");
		//10.10-4-3
		List<SangpumDto> list = inter.search(bean);
		return new ModelAndView("list", "data", list);
	}
	
}

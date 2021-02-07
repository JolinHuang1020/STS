package SpringMVCAssignment;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)	
	public ModelAndView putUserDetail() {
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	
	
	@RequestMapping(value="/loginSuccessfully", method=RequestMethod.POST)	
	public ModelAndView getUserDetail(@ModelAttribute("user1") User user1,BindingResult result) {
		if(result.hasErrors()) {
			ModelAndView model = new ModelAndView("error");
			return model;
		}
		
		ModelAndView model = new ModelAndView("success");
		return model;
	}
}

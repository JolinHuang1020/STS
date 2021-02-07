package SpringMVCAssignment;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
//	@RequestMapping("/index.jsp")
//	public ModelAndView getHelloWorld() {
//		ModelAndView model = new ModelAndView("helloWorld");
//		model.addObject("msg","Hello World");
//		return model;
//	}

	@RequestMapping("/")
	public ModelAndView getHelloPage() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	@RequestMapping("/helloWorld.jsp")
	public ModelAndView getHello() {
		ModelAndView model = new ModelAndView("helloWorld");
		model.addObject("msg", "Hello World");
		return model;
	}
}

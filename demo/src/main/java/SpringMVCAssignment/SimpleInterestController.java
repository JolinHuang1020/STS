package SpringMVCAssignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {
	
	@RequestMapping(value="/calculate", method=RequestMethod.GET)
	public ModelAndView getInterestForm() {
		ModelAndView model = new ModelAndView("simpleInterest");
		return model;
	}
	@RequestMapping(value="/getResult", method=RequestMethod.POST)
	public ModelAndView getResult(@RequestParam("principal") double principal,
						@RequestParam("numOfYear") int year, 
						@RequestParam("interestRate") double interestRate) {
		
		
		ModelAndView model = new ModelAndView("result");
		model.addObject("msg","The detail information you entered: Principal: "
				+principal+" Number of year: "+ year+" Interest Rate: "+ 
				interestRate);
		int result = (int) (principal*year*interestRate);
		model.addObject("result", "The final result is: "+result);
		return model;
	}

}

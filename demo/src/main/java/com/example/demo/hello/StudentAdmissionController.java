package com.example.demo.hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

//	@InitBinder 
//	public void initBinder(WebDataBinder binder) {
//		binder.setDisallowedFields(new String[] {"studentHobby"});
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****mm****dd");
//		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
//		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
//	}		//not working!!!
	
	
	@RequestMapping(value="/admissionForm")
	public ModelAndView getAdmissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
//	
//	@RequestMapping(value="/submitAdmissionForm", method=RequestMethod.POST) 
//	public ModelAndView submitAdmissionForm(@RequestParam (value="studentName", defaultValue="Karen")String name,
//			@RequestParam("studentHobby") String hobby) {
//		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("msg","The details information provided: "+name+", " +hobby);
//		return model;
//	}
	
	
//	@RequestMapping(value="/submitAdmissionForm", method=RequestMethod.POST) 
//	public ModelAndView submitAdmissionForm(@RequestParam ("studentName")String name,
//			@RequestParam("studentHobby") String hobby) {
//		
//		Student student1= new Student();
//		student1.setStudentName(name);
//		student1.setStudentHobby(hobby);
//		
//		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("student1", student1);
//		return model;
//	}
//	
	
	
	//with @ModelAttribute
	@RequestMapping(value="/submitAdmissionForm", method=RequestMethod.POST) 
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1")Student student1,
			BindingResult result) {
		if(result.hasErrors()) {
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		return model;
	}
	
	
}

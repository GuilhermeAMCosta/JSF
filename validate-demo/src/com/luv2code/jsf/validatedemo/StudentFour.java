package com.luv2code.jsf.validatedemo;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class StudentFour {
	private String firstName;
	private String lastName;
	private String courseCode;
	
	
	//no-arg constructor
	public StudentFour() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public void validateTheCourseCode(FacesContext context,
									  UIComponent compnent,
									  Object value) throws ValidatorException {
		if (value == null) {
			FacesMessage message = new FacesMessage("Course code is mandatory");
			
			throw new ValidatorException(message);
		}
		
		String data = value.toString();
		
		//Course code must start with LUV ... if not, throw exception
		
		if(!data.startsWith("LUV")) {
			
			FacesMessage message = new FacesMessage("Course code must start with LUV");
					
			throw new ValidatorException(message);
		}
	}
}

package com.devopsbuddy.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.devopsbuddy.enums.PlansEnum;
import com.devopsbuddy.web.domain.frontend.ProAccountPayload;

@Controller
public class SignupController {
	
	private static final Logger log=LoggerFactory.getLogger(SignupController.class);
	
	public static final String SIGNUP_URL_MAPPING="/signup";
	public static final String PAYLOAD_MODEL_KEY_NAME="payload";
	public static final String SUBSCRIPTION_VIEW_NAME="registration/signup";
	
	@RequestMapping(value=SIGNUP_URL_MAPPING,method=RequestMethod.GET)
	public String getSignupPage(@RequestParam("id") int id, ModelMap model){
		if(id!=PlansEnum.PRO.getId() && id!=PlansEnum.BASIC.getId())
			throw new IllegalArgumentException("invalid type of account type argument");
		model.addAttribute(PAYLOAD_MODEL_KEY_NAME, new  ProAccountPayload());
		return SUBSCRIPTION_VIEW_NAME;
	}
	

}

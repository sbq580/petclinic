/**
 * 
 */
package com.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HazariSH
 *
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOwner() {
		
		return "owners/index";
	}
}

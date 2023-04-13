package com.javatpoint.microservices.limitsservice;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
  
@RestController  
public class Minimum
{  
@GetMapping("/limits")  
public String retriveLimitsFromConfigurations()  
{  
	String x = "Niveus";
	String y = "";
	for(int i=x.length()-1; i>=0; i--) {
		y = y+ x.charAt(i)+"";
	}
	return y;
	
}  
}

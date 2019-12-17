package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PLayControler {

	@GetMapping("/conversions/ktoc/{num}")
	 public double getCelcius(@PathVariable String num){

		 double temp = Double.valueOf(num);
		 double c = temp - 273.15;
	     return c;    
	 }
	 
	 @GetMapping("/conversions/ctoc/{num}")
	 public double getKelvin (@PathVariable String num){

		 double temp = Double.valueOf(num);
		 double k= temp + 273.15;
	     return k;    
	 }
	 
	 @GetMapping("/conversions/mtok/{num}")
	 public double getKilometers(@PathVariable String num){

		 double distance = Double.valueOf(num);
		 double km= distance * 1.609;
	     return km;    
	 }
	 
	 @GetMapping("/conversions/ktom/{num}")
	 public double getMiles(@PathVariable String num){

		 double distance = Double.valueOf(num);
		 double miles= distance / 1.609;
	     return miles;    
	 }

}

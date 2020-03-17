package com.cts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountyController1 {
	/*@RequestMapping(value="/country11",method=RequestMethod.GET)
	public @ResponseBody CountryBean getCountry()
	{
		return new CountryBean("india","winter");
	}*/
	@RequestMapping(value="/country",method=RequestMethod.GET)
	public @ResponseBody List<CountryBean> getCountries()
	{
		ArrayList<CountryBean> comp=new ArrayList<CountryBean>();
		comp.add(new CountryBean("USA","Tropical"));
		comp.add(new CountryBean("USA","Tropical"));
		comp.add(new CountryBean("USA","Tropical"));
		return comp;
		
		//return new CountryBean("India","Summer";)
	}

}

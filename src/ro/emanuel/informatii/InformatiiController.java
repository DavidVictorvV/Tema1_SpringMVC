package ro.emanuel.informatii;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InformatiiController {

	
	@RequestMapping(value = "form.htm", method = RequestMethod.GET)
	public ModelAndView getForm() {
		
			return new ModelAndView("form.jsp",new ModelMap());
			
	}
	
	@RequestMapping(value = "calcul.htm", method = RequestMethod.POST)
	public ModelAndView computeSum(@RequestParam int a, @RequestParam int b,@RequestParam int c,@RequestParam int d,@RequestParam int e) {
		ModelMap model = new ModelMap();
		ArrayList<Integer> toateNr = new ArrayList<Integer>(Arrays.asList(a, b, c, d, e));
		int suma=0;
		int min=a;
		int max = 0;
		for (int var : toateNr) 
		{ 
		    suma+=var;
		    if(var<min) {
		    	min = var;
		    }
		    if(var>max) {
		    	max = var;
		    }
		}
		double medAr=(double)suma/(double)toateNr.size();
		toateNr.sort(null);
		
		model.put("sumaNr", suma);
		model.put("min", min);
		model.put("max", max);
		model.put("medAr", medAr);
		model.put("litaOrd", toateNr);
		
		return new ModelAndView("rezultate.jsp", model);
	}
	
}

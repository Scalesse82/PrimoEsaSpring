package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	
	
	@RequestMapping(value = "/ControlloPalindromo")
	   public ModelAndView checkPalindromo(@RequestParam("testo") String testo, Model model) {
		
		String parole[]=testo.split(" ");
		int NumeroParoleFrase=parole.length;
		List<String> ParolePalindrome= new ArrayList<String>();
		
		for (int i = 0; i < parole.length; i++) {
		
		if(isPalindroma(parole[i])) {
			
			ParolePalindrome.add(parole[i]);
			
		}
	
			
		}
		
		
		
		ModelAndView vista=new ModelAndView("risultato");
		vista.addObject("LunghezzaFrase", NumeroParoleFrase);
		vista.addObject("lista", ParolePalindrome);
		
		return vista;
	}
	
	
	public boolean isPalindroma(String parola) {
		
        if(parola.length()<2)
        	return true;
        for (int i = 0; i < parola.length()/2; i++) {
        	
        	
        	if (parola.charAt(i) !=parola.charAt((parola.length()-1)-i)) {
                return false;
            }
			
		}
        
			return true;
	}
}
	
	
	




package BackendOhjelmointi.Viikko1teht.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Viikko1tehtController {
	
	@RequestMapping("index")
	@ResponseBody
	public String returnIndex() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String returnContact() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String moikkaaKayttajaa(@RequestParam(name="sijainti") String location, @RequestParam(name="nimi") String name) {
		return "Welcome to the " + location + " " + name +"!";
	}

}

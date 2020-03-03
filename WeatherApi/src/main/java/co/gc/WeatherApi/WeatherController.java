package co.gc.WeatherApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WeatherController {

	@Autowired
	private ApiService apiServ;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("/result")
	public ModelAndView result(@RequestParam Double lat, @RequestParam Double lon) {
		ModelAndView mav = new ModelAndView("result");

		mav.addObject("weather", apiServ.findWeather(lat, lon));

		return mav;
	}

}

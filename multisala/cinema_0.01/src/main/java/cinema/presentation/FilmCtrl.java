package cinema.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cinema.entities.Film;
import cinema.service.FilmIService;

@Controller
@RequestMapping("/admin")
public class FilmCtrl {
	
	@Autowired
	private FilmIService service;
	
	@RequestMapping(path= "/listafilm")
	public ModelAndView listaFilm() {
		
		List<Film> films = service.getAll();
		
		return new ModelAndView("lista_film", "film", films);
	}

}

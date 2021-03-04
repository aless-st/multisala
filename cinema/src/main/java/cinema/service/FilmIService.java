package cinema.service;

import java.util.List;
import java.util.Set;

import cinema.entities.Film;

public interface FilmIService {
	
	List<Film> getAll(); 
	Film getOne(int id); 
//	Set<String> getGeneri(); 
//	List<Film> getGenere(String genere); 
	Film addOne(Film f);
	Film update(Film f);
	void deleteOne(int id);

}

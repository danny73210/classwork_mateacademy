package jdbcdemo.dao;

import jdbcdemo.model.Category;
import jdbcdemo.model.Film;

import java.util.Set;

public interface CategoryDao {
    void save(Category category);
    Set<Film> findAllFilms(Long categoryId);
}

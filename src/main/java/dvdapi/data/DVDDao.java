package dvdapi.data;

import dvdapi.models.DVD;

import java.util.List;

public interface DVDDao {

    DVD add(DVD todo);

    List<DVD> getAll();

    DVD findById(int id);

    DVD findByTilte(String title);

    DVD findByReleaseYear(int year);

    DVD findByDirector(String Director);

    DVD findByRating(String Rating);

    // true if item exists and is updated
    boolean update(DVD todo);

    // true if item exists and is deleted
    boolean deleteById(int id);
}

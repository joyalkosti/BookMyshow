package Repository;

import Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Movie_Repo extends JpaRepository<Movie, Integer> {
    Movie findMovieByName(String movieName);
}

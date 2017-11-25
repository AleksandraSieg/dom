package pl.madison.dao;

import org.springframework.data.repository.CrudRepository;
import pl.madison.domain.Pokoj;

public interface PokojDao extends CrudRepository<Pokoj, Long> {
}

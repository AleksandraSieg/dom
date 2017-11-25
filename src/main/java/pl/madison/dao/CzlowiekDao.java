package pl.madison.dao;

import org.springframework.data.repository.CrudRepository;
import pl.madison.domain.Czlowiek;

public interface CzlowiekDao extends CrudRepository<Czlowiek, Long> {
}

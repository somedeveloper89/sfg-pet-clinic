package nl.kabms.sfgpetclinic.repositories;

import nl.kabms.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

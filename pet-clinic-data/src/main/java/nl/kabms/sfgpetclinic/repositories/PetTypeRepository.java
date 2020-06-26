package nl.kabms.sfgpetclinic.repositories;

import nl.kabms.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

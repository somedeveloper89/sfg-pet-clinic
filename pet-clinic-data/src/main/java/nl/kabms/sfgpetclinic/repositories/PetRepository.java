package nl.kabms.sfgpetclinic.repositories;

import nl.kabms.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

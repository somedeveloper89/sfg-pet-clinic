package nl.kabms.sfgpetclinic.services;

import nl.kabms.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}

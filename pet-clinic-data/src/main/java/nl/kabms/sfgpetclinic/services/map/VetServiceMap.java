package nl.kabms.sfgpetclinic.services.map;

import nl.kabms.sfgpetclinic.model.Specialty;
import nl.kabms.sfgpetclinic.model.Vet;
import nl.kabms.sfgpetclinic.services.SpecialtiyService;
import nl.kabms.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    SpecialtiyService specialtiyService;

    public VetServiceMap(SpecialtiyService specialtiyService) {
        this.specialtiyService = specialtiyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecialties().size() > 0) {
            object.getSpecialties().forEach(specialty -> {
                if (specialty.getId() == null) {
                    Specialty savedSpecialty = specialtiyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

package nl.kabms.sfgpetclinic.services.map;

import nl.kabms.sfgpetclinic.model.Visit;
import nl.kabms.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {
        return super.save(object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}

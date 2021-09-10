package org.springframework.sfgpetclinic.services.map;

import org.springframework.sfgpetclinic.model.Pet;
import org.springframework.sfgpetclinic.model.Vet;
import org.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findaAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save( pet);
    }


    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}

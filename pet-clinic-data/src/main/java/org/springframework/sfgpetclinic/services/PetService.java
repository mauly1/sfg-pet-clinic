package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Pet;
import org.springframework.sfgpetclinic.model.Speciality;

import java.util.Set;


public interface PetService extends CrudService<Pet,Long>{

    Set<Pet> findAll();

    Pet findById(Long id);

    Pet save(Pet pet);

    void delete(Pet pet);

    void deleteById(Long id);
}

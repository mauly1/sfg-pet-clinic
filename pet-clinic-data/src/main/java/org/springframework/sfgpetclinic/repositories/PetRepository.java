package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.sfgpetclinic.model.Owner;
import org.springframework.sfgpetclinic.model.Pet;
import org.springframework.sfgpetclinic.model.PetType;

import java.util.Optional;
import java.util.Set;

public interface PetRepository extends CrudRepository<Pet,Long> {
    Set<Pet> findAll();

    Optional<Pet> findById(Long id);

    Pet save(Pet pet);

    void delete(Pet pet);

    void deleteById(Long id);
}



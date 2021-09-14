package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.sfgpetclinic.model.Owner;

import java.util.Optional;
import java.util.Set;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);

    Owner findByFirstName(String firstName);

    Set<Owner> findAll();

    Optional<Owner> findById(Long id);

    Owner save(Owner object);


    void delete(Owner owner);

    void deleteById(Long aLong);
}


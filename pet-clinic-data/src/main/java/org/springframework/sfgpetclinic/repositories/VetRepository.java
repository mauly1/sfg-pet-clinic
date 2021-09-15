package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.sfgpetclinic.model.Speciality;
import org.springframework.sfgpetclinic.model.Vet;

import java.util.Optional;
import java.util.Set;

public interface VetRepository extends CrudRepository<Vet,Long> {
    Set<Vet> findAll();

    Optional<Vet> findById(Long id);

    Vet save(Vet vet);

    void delete(Vet vet);

    void deleteById(Long id);
}

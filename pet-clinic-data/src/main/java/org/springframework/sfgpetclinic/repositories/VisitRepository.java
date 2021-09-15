package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.sfgpetclinic.model.PetType;
import org.springframework.sfgpetclinic.model.Vet;
import org.springframework.sfgpetclinic.model.Visit;

import java.util.Optional;
import java.util.Set;

public interface VisitRepository extends CrudRepository<Visit,Long> {
    Set<Visit> findAll();

    Optional<Visit> findById(Long id);

    Visit save(Visit visit);

    void delete(Visit visit);

    void deleteById(Long id);
}

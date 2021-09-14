package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.sfgpetclinic.model.Speciality;
import org.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet,Long> {
}

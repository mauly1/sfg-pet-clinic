package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}

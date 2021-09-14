package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    Owner findByFirstName(String firstName);

    Owner findById(Long aLong);

    Owner save(Owner object);

    void delete(Owner owner);

    void deleteById(Long aLong);
}

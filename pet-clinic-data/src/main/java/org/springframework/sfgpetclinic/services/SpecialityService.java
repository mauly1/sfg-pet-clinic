package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Speciality;

import java.util.Set;

public interface SpecialityService extends CrudService<Speciality,Long>{
    Set<Speciality> findAll();

    Speciality findById(Long id);

    Speciality save(Speciality speciality);

    void delete(Speciality speciality);

    void deleteById(Long id);
}

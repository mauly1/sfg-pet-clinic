package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Pet;
import org.springframework.sfgpetclinic.model.Vet;
import org.springframework.sfgpetclinic.model.Visit;

import java.util.Set;


public interface VisitService extends CrudService<Visit,Long>{

    Set<Visit> findAll();

    Visit findById(Long id);

    Visit save(Visit visit);

    void delete(Visit visit);

    void deleteById(Long id);
}

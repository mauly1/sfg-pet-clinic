package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {

    Set<Vet> findAll();

    Vet findById(Long id);

    Vet save(Vet vet);

    void delete(Vet vet);

    void deleteById(Long id);
}

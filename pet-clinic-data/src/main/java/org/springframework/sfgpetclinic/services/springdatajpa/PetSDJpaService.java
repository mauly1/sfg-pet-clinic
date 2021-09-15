package org.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.sfgpetclinic.model.Pet;
import org.springframework.sfgpetclinic.model.PetType;
import org.springframework.sfgpetclinic.model.PetTypeService;
import org.springframework.sfgpetclinic.repositories.PetRepository;
import org.springframework.sfgpetclinic.repositories.PetTypeRepository;
import org.springframework.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {
    private final PetRepository petTRepository;

    public PetSDJpaService(PetRepository petTRepository) {
        this.petTRepository = petTRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> petSet = new HashSet<>();
        petTRepository.findAll().forEach(petSet::add);
        return petSet;
    }

    @Override
    public Pet findById(Long id) {
        return petTRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet pet) {
        return petTRepository.save(pet);
    }

    @Override
    public void delete(Pet pet) {
        petTRepository.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        petTRepository.deleteById(id);
    }
}

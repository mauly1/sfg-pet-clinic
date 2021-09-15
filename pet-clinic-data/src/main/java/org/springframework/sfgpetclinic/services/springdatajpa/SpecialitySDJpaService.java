package org.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.sfgpetclinic.model.Speciality;
import org.springframework.sfgpetclinic.model.Visit;
import org.springframework.sfgpetclinic.repositories.SpecialityRepository;
import org.springframework.sfgpetclinic.repositories.VisitRepository;
import org.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {
    private final SpecialityRepository specialityRepository;

    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialitySet = new HashSet<>();
        specialityRepository.findAll().forEach(specialitySet::add);
        return specialitySet;
    }

    @Override
    public Speciality findById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public void delete(Speciality speciality) {
        specialityRepository.delete(speciality);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }
}

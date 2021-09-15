package org.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.sfgpetclinic.model.PetType;
import org.springframework.sfgpetclinic.model.PetTypeService;
import org.springframework.sfgpetclinic.model.Visit;
import org.springframework.sfgpetclinic.repositories.PetTypeRepository;
import org.springframework.sfgpetclinic.repositories.VisitRepository;
import org.springframework.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {
    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visitSet = new HashSet<>();
        visitRepository.findAll().forEach(visitSet::add);
        return visitSet;
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        visitRepository.delete(visit);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}

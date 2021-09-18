package org.springframework.sfgpetclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.sfgpetclinic.model.Owner;
import org.springframework.sfgpetclinic.repositories.OwnerRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {
    @Mock
    OwnerRepository ownerRepository;
    @InjectMocks
    OwnerSDJpaService ownerSDJpaService;
    final String lastName="Maurya";
    final Long ownerId= 1L;
    Owner returnOwner;

    @BeforeEach
    void setUp() {
         returnOwner = new Owner();
        returnOwner.setId(ownerId);
        returnOwner.setLastName(lastName);
    }

    @Test
    void findByLastName() {

        when(ownerSDJpaService.findByLastName(any())).thenReturn(returnOwner);
        Owner ownerMaurya = ownerSDJpaService.findByLastName(lastName);
        assertEquals(lastName,ownerMaurya.getLastName());
       // verify(ownerSDJpaService).findByLastName(any());
    }

    @Test
    void findByFirstName() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}
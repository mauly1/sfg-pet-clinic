package org.springframework.sfgpetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.sfgpetclinic.model.Owner;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

class OwnerMapServiceTest {
    OwnerMapService ownerMapService;
    final Long ownerId = 1L;
    final String lastName = "Maurya";
    final String firstName = "Sunil";

    @BeforeEach
    void setUp() {
        Owner owner = new Owner();
        owner.setId(ownerId);
        owner.setLastName(lastName);
        owner.setFirstName(firstName);

        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        ownerMapService.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(1, ownerSet.size());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void save() {
        final Long ownerId2 = 1L;
        final String lastName2 = "Maurya";
        final String firstName2 = "Sunil";
        Owner owner2 = new Owner();
        owner2.setId(ownerId2);
        owner2.setLastName(lastName2);
        owner2.setFirstName(firstName2);
        Owner savedOwner = ownerMapService.save(owner2);
        assertEquals(owner2.getId(), savedOwner.getId());
    }

    @Test
    void findByFirstName() {
        Owner owner = ownerMapService.findByFirstName("Sunil");
        assertEquals("Sunil", owner.getFirstName());
    }

    @Test
    void findByLastName() {
        Owner owner = ownerMapService.findByLastName("Maurya");
        assertEquals("Maurya", owner.getLastName());
    }

    @Test
    void findByLastNameDoesNotExist() {
        Owner owner = ownerMapService.findByLastName("NOLastName");
        assertNull(owner);
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerMapService.findById(ownerId).getId());
        assertEquals(0, ownerMapService.findAll().size());
    }
}
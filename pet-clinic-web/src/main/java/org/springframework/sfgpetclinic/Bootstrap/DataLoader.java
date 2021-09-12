package org.springframework.sfgpetclinic.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.sfgpetclinic.model.Owner;
import org.springframework.sfgpetclinic.model.PetType;
import org.springframework.sfgpetclinic.model.PetTypeService;
import org.springframework.sfgpetclinic.model.Vet;
import org.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.sfgpetclinic.services.VetService;
import org.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import org.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Sunil");
        owner1.setLastName("Maurya");
        owner1.setAddress("chhattisgarh");
        owner1.setCity("Korba");
        owner1.setTelephone("1111");

        Owner owner2 = new Owner();
        owner2.setFirstName("Sunil - 2");
        owner2.setLastName("Maurya -2 ");
        owner2.setAddress("chhattisgarh");
        owner2.setCity("Korba");
        owner2.setTelephone("1111");

        Owner owner3 = new Owner();
        owner3.setFirstName("Sunil - 3");
        owner3.setLastName("Maurya -3");
        owner3.setAddress("Europe");
        owner3.setCity("Vienna");
        owner3.setTelephone("333");

        ownerService.save(owner1);
        ownerService.save(owner2);
        ownerService.save(owner3);

        System.out.println("----------owner data has been loaded-------");

        Vet vet1 = new Vet();
        vet1.setFirstName("Amit -1 ");
        vet1.setLastName("Patil -1 ");

        Vet vet2 = new Vet();
        vet2.setFirstName("Amit -2 ");
        vet2.setLastName("Patil -2 ");

        Vet vet3 = new Vet();
        vet3.setFirstName("Amit -3");
        vet3.setLastName("Patil -3");

        vetService.save(vet1);
        vetService.save(vet2);
        vetService.save(vet3);

        System.out.println("----------Vet data has been loaded-------");

        PetType dog = new PetType();
        dog.setName("My Dog 1");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("My Cat 1");
        PetType saveCatPetType = petTypeService.save(cat);

    }
}

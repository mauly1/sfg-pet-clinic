package org.springframework.sfgpetclinic.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.sfgpetclinic.model.Owner;
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

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();

        owner1.setFirstName("Sunil");
        owner1.setLastName("Maurya");

        Owner owner2 = new Owner();

        owner2.setFirstName("Sunil - 2");
        owner2.setLastName("Maurya -2 ");

        Owner owner3 = new Owner();

        owner3.setFirstName("Sunil - 3");
        owner3.setLastName("Maurya -3");

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
    }
}

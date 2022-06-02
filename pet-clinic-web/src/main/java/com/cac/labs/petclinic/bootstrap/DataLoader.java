package com.cac.labs.petclinic.bootstrap;

import com.cac.labs.petclinic.model.Owner;
import com.cac.labs.petclinic.model.Person;
import com.cac.labs.petclinic.model.Vet;
import com.cac.labs.petclinic.services.CrudService;
import com.cac.labs.petclinic.services.OwnerService;
import com.cac.labs.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
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
    public void run(String... args) {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        printLoaded(ownerService, "owners");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        printLoaded(vetService, "vets");
    }

    private void printLoaded(CrudService<? extends Person, Long> service, String serviceName) {
        System.out.println("Loaded " + serviceName + ":");
        service .findAll()
                .forEach(loaded -> System.out.println(loaded.getId() + " - " + loaded.getFirstName()));
    }
}

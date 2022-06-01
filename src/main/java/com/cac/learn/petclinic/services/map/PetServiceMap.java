package com.cac.learn.petclinic.services.map;

import com.cac.learn.petclinic.model.Pet;
import com.cac.learn.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}

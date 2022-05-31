package com.cac.learn.petclinic.services;

import com.cac.learn.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}

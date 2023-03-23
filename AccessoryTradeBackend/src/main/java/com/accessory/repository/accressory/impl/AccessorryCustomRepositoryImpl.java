package com.accessory.repository.accressory.impl;

import com.accessory.repository.accressory.AccessorryRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class AccessorryCustomRepositoryImpl /*implements AccessorryRepository*/ {
    @PersistenceContext
    private EntityManager entityManager;

    /*@Override*/
    public List sortByPrice() {

        String jql = "Select f from Accessory as f order by f.price desc";

        return entityManager.createQuery(jql)
                .getResultList();
    }
}

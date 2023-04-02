package com.accessory.repository.accressory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class AccessorryCustomRepositoryImpl implements AccessorryCustomRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List sortByPrice() {

        String jql = "Select f from Accessory as f order by f.price desc";



        return entityManager.createQuery(jql)
                .getResultList();
    }
}

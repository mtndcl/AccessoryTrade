package com.accessory.repository;

import com.accessory.model.Accessory;
import com.accessory.repository.accressory.AccessorryCustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccessorryRepository extends AccessorryCustomRepository, JpaRepository<Accessory, Integer> {


}

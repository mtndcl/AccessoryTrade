package com.accessory.repository;

import com.accessory.model.Accessory;
import com.accessory.model.Earrings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessorryRepository extends JpaRepository<Accessory, Long> {

}

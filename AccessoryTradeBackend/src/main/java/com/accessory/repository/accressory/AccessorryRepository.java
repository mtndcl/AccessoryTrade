package com.accessory.repository.accressory;

import com.accessory.model.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AccessorryRepository extends JpaRepository<Accessory,Long> {
    List<Accessory> sortByPrice();

}

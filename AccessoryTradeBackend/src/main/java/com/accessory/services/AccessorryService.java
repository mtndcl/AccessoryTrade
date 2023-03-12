package com.accessory.services;


import com.accessory.model.Accessory;
import com.accessory.model.Earrings;
import com.accessory.repository.AccessorryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessorryService {

    private  final AccessorryRepository accessorryRepository;

    @Autowired
    public AccessorryService(AccessorryRepository accessorryRepository){
        this.accessorryRepository=accessorryRepository;

    }

    public List<Accessory> getAll() {

        return accessorryRepository.findAll();
    }
}

package com.accessory.services;


import com.accessory.model.Accessory;
import com.accessory.repository.AccessorryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessorryServiceImpl implements AccessoryService{

    private  final AccessorryRepository accessorryRepository;

    @Autowired
    public AccessorryServiceImpl(AccessorryRepository accessorryRepository){
        this.accessorryRepository=accessorryRepository;
    }
    @Override
    public List<Accessory> getAll() {
        return accessorryRepository.findAll();
    }
}

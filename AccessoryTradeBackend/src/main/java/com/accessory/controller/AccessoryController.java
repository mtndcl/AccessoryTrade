package com.accessory.controller;


import com.accessory.model.Accessory;
import com.accessory.services.AccessorryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("accessories")
public class AccessoryController {

    private  final AccessorryService accessorryService;

    @Autowired
    public AccessoryController(AccessorryService accessorryService){
        this.accessorryService=accessorryService;

    }

    @GetMapping("/all")
    public List<Accessory> getAllAccessories(){


        List<Accessory>  accessoryList=this.accessorryService.getAll();

        return  accessoryList;
    }
}

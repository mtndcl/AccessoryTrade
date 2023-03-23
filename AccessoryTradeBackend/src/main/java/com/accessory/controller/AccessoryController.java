package com.accessory.controller;


import com.accessory.messagr.MessageWrapper;
import com.accessory.services.AccessorryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accessories")
public class AccessoryController {
    private final AccessorryServiceImpl accessorryService;

    @Autowired
    public AccessoryController(AccessorryServiceImpl accessorryService) {
        this.accessorryService = accessorryService;
    }

    @GetMapping("/all")
    public MessageWrapper getAllAccessory() {
        return this.accessorryService.getAll();
    }

    @GetMapping("/sortByPrice")
    public MessageWrapper sortByPrice() {
        return this.accessorryService.sortByPrice();
    }
}

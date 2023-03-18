package com.accessory.controller;


import com.accessory.messagr.MessageType;
import com.accessory.messagr.MessageWrapper;
import com.accessory.model.Accessory;
import com.accessory.services.AccessorryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("accessories")
public class AccessoryController {

    private final AccessorryServiceImpl accessorryService;

    @Autowired
    public AccessoryController(AccessorryServiceImpl accessorryService) {
        this.accessorryService = accessorryService;
    }

    @GetMapping("/all1")
    public MessageWrapper getAllAccessory() {
        List<Accessory> accessoryList = this.accessorryService.getAll();
        MessageWrapper messageWrapper = new MessageWrapper();
        messageWrapper.setMessageType(MessageType.SUCCESS);
        messageWrapper.setData(accessoryList);
        return messageWrapper;
    }
}

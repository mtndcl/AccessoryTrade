package com.accessory.services;


import com.accessory.messagr.MessageWrapper;
import com.accessory.repository.accressory.AccessorryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessorryServiceImpl {

    private  final AccessorryRepository accessorryRepository;

    @Autowired
    public AccessorryServiceImpl(AccessorryRepository accessorryRepository){
        this.accessorryRepository=accessorryRepository;
    }

    public MessageWrapper getAll() {

        MessageWrapper messageWrapper=new MessageWrapper();

        messageWrapper.setData(accessorryRepository.findAll());

        return messageWrapper;
    }

    public MessageWrapper sortByPrice() {

        MessageWrapper messageWrapper=new MessageWrapper();

        messageWrapper.setData(accessorryRepository.sortByPrice());

        return messageWrapper;
    }
}

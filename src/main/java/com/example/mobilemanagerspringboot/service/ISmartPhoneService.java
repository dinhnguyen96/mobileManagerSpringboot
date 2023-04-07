package com.example.mobilemanagerspringboot.service;


import com.example.mobilemanagerspringboot.model.Smartphone;

import java.util.Optional;

public interface ISmartPhoneService
{
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}

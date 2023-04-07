package com.example.mobilemanagerspringboot.repository;

import com.example.mobilemanagerspringboot.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartPhoneRepository extends JpaRepository<Smartphone, Long> {
}

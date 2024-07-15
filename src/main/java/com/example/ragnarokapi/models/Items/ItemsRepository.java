package com.example.ragnarokapi.models.Items;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ragnarokapi.models.Lojas.Vendings;

public interface ItemsRepository extends JpaRepository<Items, Integer> {
    // List<Items> findByVending_id(Long vending_id);
}

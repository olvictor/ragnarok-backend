package com.example.ragnarokapi.models.CartInventory;


import com.example.ragnarokapi.models.Items.Items;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name= "cart_inventory")
@Entity
@Getter
@Setter
public class CartInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @JoinColumn(name ="cartinventory_id")
    private int id;

    private int nameid;
    private int amount;

}
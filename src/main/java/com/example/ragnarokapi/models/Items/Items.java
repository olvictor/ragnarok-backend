package com.example.ragnarokapi.models.Items;


import com.example.ragnarokapi.models.CartInventory.CartInventory;
import com.example.ragnarokapi.models.Lojas.Vendings;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "vending_items")
@Entity
@Getter
@Setter
public class Items {
   @Id
   private int index;

   @JsonIgnore
   @ManyToOne
   @JoinColumn(name = "vending_id")
   private Vendings vending;

   private int amount;
   private int price;
   private int cartinventory_id;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "cartinventory_id")
   @PrimaryKeyJoinColumn
   private CartInventory cartInventory;

}
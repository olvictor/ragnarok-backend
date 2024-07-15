package com.example.ragnarokapi.models.Items;

import com.example.ragnarokapi.models.CartInventory.CartInventory;
import com.example.ragnarokapi.models.Lojas.Vendings;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "vending_items")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@IdClass(ItemsId.class) // Indica que usaremos uma classe para representar a chave primária composta

public class Items {
   @Id
   @ManyToOne
   @JsonIgnore
   @JoinColumn(name = "vending_id", referencedColumnName = "id")
   private Vendings vending;

   @Id
   private int index;

   private int cartinventory_id;
   private int amount;
   private int price;

}
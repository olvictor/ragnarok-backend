package com.example.ragnarokapi.models.Items;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemsId implements Serializable {
    private Long vending; // Corresponds to Vendings.id

    private int index;
}

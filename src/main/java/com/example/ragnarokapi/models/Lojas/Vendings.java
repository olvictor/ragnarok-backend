package com.example.ragnarokapi.models.Lojas;

import com.example.ragnarokapi.models.Items.Items;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table
@Entity(name = "vendings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Vendings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer account_id;
    private Integer char_id;
    private String sex;
    private String map;
    private short x;
    private short y;
    private String title;
    private int body_direction;
    private int head_direction;
    private int sit;
    private int autotrade;

    @OneToMany(mappedBy = "vending")
    private List<Items> items;

}
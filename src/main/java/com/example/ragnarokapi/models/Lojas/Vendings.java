package com.example.ragnarokapi.models.Lojas;

import com.example.ragnarokapi.models.Items.Items;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Table(name = "vendings")
@Entity(name = "vendings")
@Getter
@Setter

public class Vendings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
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
    @Override
    public String toString() {
        return " Loja: " + this.title +  " Where : " + this.map + ","+ this.x +","+this.y + " do jogador: " + this.char_id ;
    }
}
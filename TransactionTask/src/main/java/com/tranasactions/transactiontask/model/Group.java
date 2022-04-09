package com.tranasactions.transactiontask.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usergroup")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;
}
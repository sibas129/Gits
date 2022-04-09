package com.tranasactions.transactiontask.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private  Integer age;
    @Column(name = "gender")
    private String gender;
    @Column(name = "groupId")
    private Integer groupId;
}

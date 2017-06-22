package com.suhlob.hibernate.entity;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class Model implements Serializable{
    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

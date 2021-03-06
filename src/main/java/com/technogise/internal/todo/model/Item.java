package com.technogise.internal.todo.model;


import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Item
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    public Item() {
    }

    public Item(String description) {
        this.description = description;
    }
    public Item(Long id, String description) {
        this.id = id;
        this.description = description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public Long getId()
    {
        return id;
    }

    public String getDescription()
    {
        return description;
    }
}

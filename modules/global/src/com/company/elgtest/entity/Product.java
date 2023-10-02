package com.company.elgtest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIdentityIdEntity;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.DdlGeneration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.CREATE_ONLY)
@Table(name = "product")
@Entity(name = "elgtest_Product")
@NamePattern("%s|name")
public class Product extends BaseIdentityIdEntity {
    private static final long serialVersionUID = 8156275686763791578L;
    @Column(name = "cost", nullable = false)
    private Double cost;
    @Column(name = "name", nullable = false, length = 300)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
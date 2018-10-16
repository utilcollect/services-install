package com.gezhiwei.servicesinstall.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "servers")
public class ServersENT {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer num;

    public Long getId() {
        return id;
    }

    public ServersENT setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ServersENT setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public ServersENT setNum(Integer num) {
        this.num = num;
        return this;
    }
}

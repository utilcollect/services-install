package com.gezhiwei.servicesinstall.controller.vo;

import com.gezhiwei.servicesinstall.dao.entity.ServersENT;

public class Servers {
    private Long id;

    private String name;

    private String num;

    public Servers(ServersENT sv) {
        this.id = sv.getId();
        this.name = sv.getName();
        this.num = String.valueOf(sv.getNum());
    }

    public Long getId() {
        return id;
    }

    public Servers setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Servers setName(String name) {
        this.name = name;
        return this;
    }

    public String getNum() {
        return num;
    }

    public Servers setNum(String num) {
        this.num = num;
        return this;
    }
}

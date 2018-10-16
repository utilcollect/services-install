package com.gezhiwei.servicesinstall.service.impl;

import com.gezhiwei.servicesinstall.dao.ServersDao;
import com.gezhiwei.servicesinstall.dao.entity.ServersENT;
import com.gezhiwei.servicesinstall.service.ServersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServersServiceImpl implements ServersService {

    @Autowired
    private ServersDao serversDao;

    @Override
    public List<ServersENT> listAll() {
        List<ServersENT> all = serversDao.findAll();
        return all;
    }
}

package com.gezhiwei.servicesinstall.dao;

import com.gezhiwei.servicesinstall.dao.entity.ServersENT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServersDao extends JpaRepository<ServersENT, Long> {
}

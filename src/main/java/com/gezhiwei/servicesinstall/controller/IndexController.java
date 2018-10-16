package com.gezhiwei.servicesinstall.controller;

import com.gezhiwei.servicesinstall.controller.base.BaseController;
import com.gezhiwei.servicesinstall.controller.vo.Servers;
import com.gezhiwei.servicesinstall.dao.entity.ServersENT;
import com.gezhiwei.servicesinstall.service.ServersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController extends BaseController {


    @Autowired
    private ServersService serversService;

    /**
     * 跳转首页
     *
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "redirect:index.html";
    }

    @GetMapping("/mgrServers")
    public ModelAndView mgr() {
        List<ServersENT> serversENTS = serversService.listAll();
        List<Servers> serversList = new ArrayList<>();
        serversENTS.forEach(sv -> serversList.add(new Servers(sv)));
        ModelAndView modelAndView = new ModelAndView("/page/mgrServers");
        modelAndView.addObject("serversList", serversList);
        return modelAndView;
    }
}

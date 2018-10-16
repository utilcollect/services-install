package com.gezhiwei.servicesinstall.controller.base;

import com.gezhiwei.servicesinstall.common.ResultVo;

public abstract class BaseController {

    public ResultVo getSuccessVo(Object obj) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setErrMsg("");
        resultVo.setData(obj);
        return resultVo;
    }
}

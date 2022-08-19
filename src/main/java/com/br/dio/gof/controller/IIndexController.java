package com.br.dio.gof.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface IIndexController extends ErrorController {
    @RequestMapping(IndexController.PATH)
    @ResponseBody
    String getErrorPath();
}

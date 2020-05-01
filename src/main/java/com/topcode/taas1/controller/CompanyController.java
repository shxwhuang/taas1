package com.topcode.taas1.controller;

import com.topcode.taas1.entity.Company;
import com.topcode.taas1.service.ICompanyService;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: taas1
 * @description: Company Controller
 * @author: HuangXiwei
 * @create: 2020-04-30 23:12
 **/
@Slf4j
@RestController
@RequestMapping("/company")
public class CompanyController {
  @Autowired
  ICompanyService companyService;

  @PostMapping("/register")
  void registerCompany(@RequestBody Company company) {
    companyService.saveCompany(company);
  }

  @RequestMapping("/list")
  public List<Company> getCompanyList() {
    log.info("A list query!");
    return companyService.findAll();
  }

}

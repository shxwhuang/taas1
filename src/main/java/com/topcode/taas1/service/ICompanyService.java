package com.topcode.taas1.service;

import com.topcode.taas1.entity.Company;
import java.util.List;

/**
 * @program: taas1
 * @description: Company service interface
 * @author: HuangXiwei
 * @create: 2020-05-01 12:41
 **/
public interface ICompanyService {
  void saveCompany(Company company);

  List<Company> findAll();
}

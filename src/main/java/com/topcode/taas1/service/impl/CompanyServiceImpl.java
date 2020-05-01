package com.topcode.taas1.service.impl;

import com.topcode.taas1.entity.Company;
import com.topcode.taas1.repository.ICompanyRepository;
import com.topcode.taas1.service.ICompanyService;
import java.time.LocalDateTime;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: taas1
 * @description: Implementation of Company Service
 * @author: HuangXiwei
 * @create: 2020-05-01 12:44
 **/
@Service
public class CompanyServiceImpl implements ICompanyService {

  @Autowired
  ICompanyRepository ICompanyRepository;

  @Override
  @Transactional
  public void saveCompany(Company company) {
    company.setGmt_create(LocalDateTime.now());
    company.setGmt_modified(LocalDateTime.now());
    ICompanyRepository.save(company);
  }

  @Override
  public List<Company> findAll() {
    return ICompanyRepository.findAll();
  }
}

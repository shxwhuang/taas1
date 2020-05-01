package com.topcode.taas1.repository;

import com.topcode.taas1.entity.Company;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @program: taas1
 * @description: Company repository
 * @author: HuangXiwei
 * @create: 2020-05-01 12:30
 **/
@Repository
public interface ICompanyRepository extends JpaRepository<Company, Long>,
    JpaSpecificationExecutor<Company> {
}

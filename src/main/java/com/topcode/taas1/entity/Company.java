package com.topcode.taas1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: taas1
 * @description: Entity class of Company Table
 * @author: HuangXiwei
 * @create: 2020-05-01 11:44
 **/
@Data
@NoArgsConstructor
@Entity
@Table(name = "Company", indexes = {@Index(name = "id", columnList = "id", unique = true),
    @Index(name = "idx_name", columnList = "name", unique = false),
    @Index(name = "idx_incorporation_date", columnList = "incorporation_date", unique = false),
    @Index(name = "idx_employees", columnList = "employees", unique = false),
})
public class Company {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 40, nullable = false)
  private String name;

  @Column(length = 200, nullable = false)
  private String founders;

  @Column(nullable = false)
  private Integer employees = 1;

  @Column(length = 8)
  private String incorporation_date;

  @Column(length = 200)
  private String address;

  @Column(length = 40)
  private String city;

  @Column(length = 100)
  private String country;

  @Column(nullable = false)
  private LocalDateTime gmt_create;

  @Column(nullable = false)
  private LocalDateTime gmt_modified;

}

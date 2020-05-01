package com.topcode.taas1.common;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: taas1
 * @description: API result entitiy
 * @author: HuangXiwei
 * @create: 2020-05-01 14:50
 **/
@Data
@NoArgsConstructor
public class ApiResult<T> {
  private int code = RetCode.SUCCESS;

  private String msg = "Successfully!";

  private T data;

  public ApiResult(int code, String msg) {
    this.code = code;
    this.msg = msg;
  }
  public ApiResult( String msg) {
    this.msg = msg;
  }
}

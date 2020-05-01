package com.topcode.taas1.common;

/**
 * @program: taas1
 * @description: response code
 * @author: HuangXiwei
 * @create: 2020-05-01 14:49
 **/

public class RetCode {
  // success
  public static final int SUCCESS=200;
  // failed
  public static final int FAIL=400;
  // Auth failed
  public static final int  UNAUTHORIZED=401;
  // interface not exist
  public static final int NOT_FOUND=404;
  // Internel Server Error
  public static final int INTERNAL_SERVER_ERROR=500;
}

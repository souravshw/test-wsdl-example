package com.globalss.test.web;

import com.globalss.test.service.WsdlService;
import com.globalss.test.service.pojo.AddSubtractRequest;
import com.globalss.test.service.pojo.AddSubtractResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

public class WsdlServiceImpl implements WsdlService {

  @WebMethod
  @WebResult(name = "AddSubtractRequest")
  public AddSubtractResponse AddSubtractRequest(
          @WebParam(name = "AddSubtractRequest") AddSubtractRequest AddSubtractRequest){
    return null;
  }
}

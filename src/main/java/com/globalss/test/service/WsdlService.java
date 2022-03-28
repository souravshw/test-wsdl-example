package com.globalss.test.service;

import com.globalss.test.service.pojo.AddSubtractRequest;
import com.globalss.test.service.pojo.AddSubtractResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

public interface WsdlService {

  @WebMethod
  @WebResult(name = "AddSubtractRequest")
  public AddSubtractResponse AddSubtractRequest(
          @WebParam(name = "AddSubtractRequest") AddSubtractRequest AddSubtractRequest);
}

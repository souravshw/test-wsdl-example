package com.globalss.test.service.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddSubtractRequest {
  private AddRequest addRequest;
  private SubtractRequest subtractRequest;
}

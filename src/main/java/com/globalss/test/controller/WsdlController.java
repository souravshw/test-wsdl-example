package com.globalss.test.controller;

import com.ibm.wsdl.util.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.io.*;

@RestController(value = "/api")
public class WsdlController {


  @GetMapping(name = "/wsdl", produces = MediaType.APPLICATION_XML_VALUE)
  public ResponseEntity<String> getWsdl() {
    try {

      Resource resource = new ClassPathResource("add-subtract.wsdl");
      InputStream fileInputStream = resource.getInputStream();

      try (BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));) {

        String result = IOUtils.getStringFromReader(reader);

        return new ResponseEntity(result, HttpStatus.OK);
      } catch (Exception cause) {

        cause.printStackTrace();
        return new ResponseEntity( "Error while showing wsdl", HttpStatus.INTERNAL_SERVER_ERROR);
      }

    } catch (IOException cause) {
      cause.printStackTrace();

    }
    return null;
  }

  @RequestMapping( name="/test", method = RequestMethod.GET)
  public String welcome() {
    return "Hello World !!";
  }



}

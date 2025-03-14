package com.bonbonn.webmvc.MockController;


import com.bonbonn.webmvc.model.CalculationRequest;
import com.bonbonn.webmvc.model.CalculationResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class MockApi {


  @PostMapping("/calculate")
  public CalculationResponse calculate(@RequestBody CalculationRequest calculationRequest) {
    CalculationResponse calculationResponse = new CalculationResponse();
    calculationResponse.setSummary(calculationRequest.getName()+ "----" + calculationRequest.getValue());
    return calculationResponse;
  }
}


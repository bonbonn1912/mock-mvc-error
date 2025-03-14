package com.bonbonn.webmvc.MockController;


import com.bonbonn.webmvc.model.CalculationRequest;
import com.bonbonn.webmvc.model.CalculationResponse;
import com.bonbonn.webmvc.service.CalculationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TestController {

  private final CalculationService calculationService;

  @PostMapping("/integration")
  public CalculationResponse integration(@RequestBody CalculationRequest request) {
    return calculationService.calculate(request);
  }

}

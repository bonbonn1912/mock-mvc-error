package com.bonbonn.webmvc.service;

import com.bonbonn.webmvc.model.CalculationRequest;
import com.bonbonn.webmvc.model.CalculationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class CalculationService {

  private final RestClient restClient;

  public CalculationResponse calculate(CalculationRequest request){
    return restClient.post().uri("/service/calculate")
        .body(request)
        .retrieve()
        .toEntity(CalculationResponse.class).getBody();

  }

  public CalculationResponse withoutApi(CalculationRequest request){
    System.out.println(request.getName());
    CalculationResponse calculationResponse = new CalculationResponse();
    calculationResponse.setSummary(request.getName()+ "----" + request.getValue());
    return calculationResponse;
  }

}

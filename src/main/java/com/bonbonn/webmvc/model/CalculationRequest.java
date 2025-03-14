package com.bonbonn.webmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CalculationRequest {

  private final String name;
  private final String value;

}

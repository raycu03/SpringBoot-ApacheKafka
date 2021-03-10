package com.prueba.apache.kafka.helper;

public enum StatusDTO {
  ACTIVO("ACTIVO"),
  INACTIVO("INACTIVO");

  private String value;

  StatusDTO(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}

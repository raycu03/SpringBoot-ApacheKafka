package com.prueba.apache.kafka.helper;

public enum TypeDTO {

  FUNCIONARIO("FUNCIONARIO"),
  PADRE("PADRE"),
  ESTUDIANTE("ESTUDIANTE");

  private String value;

  TypeDTO(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}

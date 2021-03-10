package com.prueba.apache.kafka.helper;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCampusDTO {

  private String campusCode;

  private TypeDTO type;

  private List<String> roleList;
}

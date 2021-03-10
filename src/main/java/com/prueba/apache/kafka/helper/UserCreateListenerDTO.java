package com.prueba.apache.kafka.helper;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateListenerDTO {


  private String idType;

  private String idNumber;

  private String firstName;

  private String lastName;

  private String email;

  private String username;

  private String password;

  private String cellphoneNumber;

  private String telephoneNumber;

  private String municipalityCode;

  private StatusDTO status;

  private String customer;

  private List<UserCampusDTO> userCampus;

}

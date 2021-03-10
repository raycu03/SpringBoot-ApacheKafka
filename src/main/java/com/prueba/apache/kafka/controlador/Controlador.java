package com.prueba.apache.kafka.controlador;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prueba.apache.kafka.helper.ProductorKafka;
import com.prueba.apache.kafka.helper.UserCreateListenerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ProgramacionColombia
 */
@RestController
@RequestMapping("Controlador")
public class Controlador {

  ObjectMapper mapper = new ObjectMapper();
  @Autowired
  private ProductorKafka productorKafka;

  @GetMapping("/mensaje")
  public String enviarMensaje(@RequestBody UserCreateListenerDTO mensaje)
      throws JsonProcessingException {
    String respuesta = "Proceso exitoso";
    String json = mapper.writerWithDefaultPrettyPrinter()
        .writeValueAsString(mensaje);

    try {
      productorKafka.send(json);
    } catch (Exception e) {
      respuesta = "Error desconocido";
    }
    return respuesta;

  }

}

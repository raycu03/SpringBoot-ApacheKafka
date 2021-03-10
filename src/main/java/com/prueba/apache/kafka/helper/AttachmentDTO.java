package com.prueba.apache.kafka.helper;

import java.io.InputStream;

public class AttachmentDTO {

  private InputStream content;
  private String fileName;
  private String contentType;

  public InputStream getContent() {
    return content;
  }

  public void setContent(InputStream content) {
    this.content = content;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }
}

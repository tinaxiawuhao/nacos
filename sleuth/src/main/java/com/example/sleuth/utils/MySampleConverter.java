package com.example.sleuth.utils;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import lombok.SneakyThrows;
import java.net.InetAddress;

public class MySampleConverter extends ClassicConverter {

  @SneakyThrows
  @Override
  public String convert(ILoggingEvent event) {
    return InetAddress.getLocalHost().getHostAddress();
  }
}

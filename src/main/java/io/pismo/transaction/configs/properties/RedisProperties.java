package io.pismo.transaction.configs.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisProperties {

  @Value("${spring.redis.host:127.0.0.1}")
  private String host;

  @Value("${spring.redis.port:6379}")
  private int port;

  @Value("${spring.redis.password:}")
  private String password;

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

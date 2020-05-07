package com.midway.ocp8.lambda.functionalInterface.builtIn.consumer;

import java.util.Map;
import java.util.function.BiConsumer;
import com.midway.ocp8.model.User;

public class ConsumerSample4 {

  public static void main(String[] args) {
    Map<String, String> env = System.getenv();
    User user = new User();
    BiConsumer<String, String> findUsername = (key, value) -> {
      if (key.equals("USERNAME")) {
        user.setUsername(value);
      }
    };
    env.forEach(findUsername);
    System.out.println("Username from env :  = " + user.getUsername());
  }
}

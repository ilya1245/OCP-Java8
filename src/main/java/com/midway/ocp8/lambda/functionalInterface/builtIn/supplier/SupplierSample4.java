package com.midway.ocp8.lambda.functionalInterface.builtIn.supplier;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SupplierSample4 {

  public static void main(String[] args) {
    String host = "dpi.dpi.ir";
    int port = 80;
    //setup logging
    Logger logger = Logger.getLogger("Status Logger");
    /* OFF,SEVERE,WARNING,INFO,CONFIG,FINE,FINER,FINEST */
    Supplier<String> status = () -> {
      System.out.println("Status check supplier run");
      int timeout = 1000;
      try (Socket socket = new Socket()) {
        socket.connect(new InetSocketAddress(host, port), timeout);
        return "up";
      } catch (IOException e) {
        return "down";
      }
    };
    logger.setLevel(Level.SEVERE);
    try {
      logger.log(Level.INFO, status);
      new Socket().connect(new InetSocketAddress(host, port), 1000);
      //do sth with url
    } catch (Exception e) {
      logger.log(Level.SEVERE, status);
    }
  }
}
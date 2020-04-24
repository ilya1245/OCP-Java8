package com.midway.ocp8.lambda.functionalInterface.builtIn.supplier;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SupplierSample3 {

  public static void main(String[] args) {
    Logger logger = Logger.getLogger("Status Logger");
    /* OFF,SEVERE,WARNING,INFO,CONFIG,FINE,FINER,FINEST */
    logger.setLevel(Level.SEVERE);
    String currentStatus = "Every thing's okay";
    logger.log(Level.INFO, currentStatus);
  }
}
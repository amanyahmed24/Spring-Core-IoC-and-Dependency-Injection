package com.ioc;
import org.springframework.stereotype.Component;
@Component

public class DatabaseConnection {
  public void connectingDB() {
    System.out.println("Connecting to DB...");
  }

  public void desConnectingDB() {
    System.out.println("Disconnecting from DB...");
  }
}

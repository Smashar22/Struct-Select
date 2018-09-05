import java.util.*;
import java.lang.*;
import java.io.IOException;
// import java.lang.System;
import java.io.Console;

public class StructSelect {

  String dataType;
  String dataElements;
  String dataChange;
  String dataOperation;
  String dataFast;

  public static void main(String[] args) {

    System.out.println("\nWelcome to the data structure selector\n");
    
    StructSelect selector = new StructSelect();
    selector.setVars(selector);

    System.out.println("Data Type = " + selector.dataType);
    System.out.println("Data Number of Elements = " + selector.dataType);
    System.out.println("Data Change Rate = " + selector.dataType);
    System.out.println("Data Operations = " + selector.dataType);
    System.out.println("Data Fastest Operation = " + selector.dataType);

    System.out.println("\nBased on these inputs you should use X data structure");
  }

  void StructSelect() {
    // Acquire variables
    this.dataType = "";
    this.dataElements = "";
    this.dataChange = "";
    this.dataOperation = "";
    this.dataFast = "";
  }

  void setVars(StructSelect o) {
    // Set the Vars
    Console c = System.console();
    if (c == null) {
        System.err.println("No console.");
        System.exit(1);
    }
    o.dataType = c.readLine("What data type are your data? (Answer: Object, Integer, Double, String)");
    o.dataElements = c.readLine("How many data elements do you have? (1000, 10000, 100000, 1000000+)");
    o.dataChange = c.readLine("How often does it change? (Answer: Alot, Rarely, Never)");
    o.dataOperation = c.readLine("Do you need to sort it, do you need to search it? (Answer: Sort, Search, Both)");
    o.dataFast = c.readLine("Faster to Access, Insert, or Delete? (Answer: Access, Insert, Delete)");

  }
}
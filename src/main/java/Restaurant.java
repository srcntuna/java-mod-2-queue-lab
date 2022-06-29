import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Restaurant {

  private Map<Integer, String> tables;
  private Queue<String> waitList;

  public Restaurant() {
    this.tables = new HashMap<Integer, String>();
    this.waitList = new LinkedList<String>();
    // initially i assumed there is one table full and other table is empty
    tables.put(1, "sercan");
    tables.put(2, null);

  }

  public void checkIn(String customerName) {

    for (Map.Entry<Integer, String> table : tables.entrySet()) {

      if (table.getValue() == null) {

        int tableNo = table.getKey();
        tables.replace(tableNo, customerName.toLowerCase());
        System.out.println(customerName + " has been placed to table no: " + tableNo);
        return;
      }

    }

    waitList.add(customerName.toLowerCase());
    System.out.println("Sorry, there is no place available right now.");
    System.out.println(customerName + " has been added to the waitList!.");

  }

  public void checkOut(String customerName) {

    for (Map.Entry<Integer, String> table : tables.entrySet()) {

      if (table.getValue() == null)
        continue;

      if (table.getValue().equals(customerName)) {

        System.out.println("hey iam here");
        int tableNo = table.getKey();
        tables.replace(tableNo, null);
        System.out.println(customerName + " has been checked out from table no: " + tableNo);
        String firstCustomerInWaitlist;
        try {
          firstCustomerInWaitlist = waitList.remove();
        } catch (NoSuchElementException e) {
          System.out.println("There is nobody in the waitlist.");
          return;
        }
        this.checkIn(firstCustomerInWaitlist);
        return;
      }

    }

    System.out.println("You can not check out if you didnt even check in!");

  }

}

import java.util.HashMap;

public class HashMapDemo {
  public static void main(String[] args) {
    var map = new HashMap<String, String>();
    map.put("test", "test");
    map.put("test", "test");
    System.out.println(map.get("test"));}
}

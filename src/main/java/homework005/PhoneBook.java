package homework005;
import java.util.*;

public class PhoneBook {
     private static Map<String, ArrayList<String>> map = new HashMap<>();

    public static void addContact(String name, String phoneNumber) {
        if (map.containsKey(name)) {
            ArrayList<String> list = map.get(name);
            list.add(phoneNumber);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(phoneNumber);
            map.put(name, list);
        }
    }

    String getList() {
        System.out.println("List of all contacts:");
        System.out.print("\n");
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    void sortedPrint() {
        Comparator<Map.Entry<String, ArrayList<String>>> valueComparator = ((obj1, obj2) ->
                Integer.compare(obj2.getValue().size(), obj1.getValue().size()));
        List<Map.Entry<String, ArrayList<String>>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(valueComparator);
        System.out.println("Sorted by number of phones in descending order:");
        System.out.print ("\n");
        sortedList.forEach(System.out::println);
    }
}
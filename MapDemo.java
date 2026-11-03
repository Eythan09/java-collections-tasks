import java.util.*;

// Работа с Map: поиск задачи по id
public class MapDemo {

    public static void run() {
        System.out.println("\n===== MAP (HashMap) =====");
        Map<Integer, Task> taskMap = new HashMap<>();

        taskMap.put(1, new Task(1, "Сделать дизайн", "TODO", 3));
        taskMap.put(2, new Task(2, "Написать код", "IN_PROGRESS", 5));
        taskMap.put(3, new Task(3, "Протестировать", "TODO", 4));

        System.out.println("Задача с id=2: " + taskMap.get(2));
        System.out.println("Есть id=3? " + taskMap.containsKey(3));

        // тот же ключ — старое значение заменяется
        taskMap.put(2, new Task(2, "Написать код (новая версия)", "DONE", 5));
        System.out.println("После повторного put с id=2: " + taskMap.get(2));

        taskMap.remove(3);
        System.out.println("Есть id=3 после удаления? " + taskMap.containsKey(3));

        // перебор через entrySet()
        System.out.println("-- entrySet --");
        for (Map.Entry<Integer, Task> entry : taskMap.entrySet()) {
            System.out.println("id " + entry.getKey() + " -> " + entry.getValue().getTitle());
        }
    }
}

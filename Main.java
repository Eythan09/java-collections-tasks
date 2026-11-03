import java.util.*;

// Система управления задачами: демонстрация List, Set, Map
public class Main {
    public static void main(String[] args) {
        List<Task> tasks = ListDemo.run();
        SetDemo.run();
        MapDemo.run();

        // сортировка по приоритету (от высокого к низкому)
        System.out.println("\n===== СОРТИРОВКА по приоритету =====");
        tasks.sort(Comparator.comparing(Task::getPriority).reversed());
        for (Task t : tasks) {
            System.out.println(t);
        }

        // поиск по названию
        System.out.println("\n===== ПОИСК: 'Протестировать' =====");
        for (Task t : tasks) {
            if (t.getTitle().equals("Протестировать")) {
                System.out.println("Найдено: " + t);
            }
        }

        // фильтрация по статусу
        System.out.println("\n===== ФИЛЬТР: статус TODO =====");
        for (Task t : tasks) {
            if (t.getStatus().equals("TODO")) {
                System.out.println(t);
            }
        }

        // проверка некорректного значения
        System.out.println("\n===== ПРОВЕРКА ВВОДА =====");
        try {
            new Task(99, "Ошибка", "TODO", 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

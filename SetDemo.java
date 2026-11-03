import java.util.*;

// Работа с Set: уникальные метки и уникальные задачи
public class SetDemo {

    public static void run() {
        System.out.println("\n===== SET (HashSet) =====");
        Set<String> labels = new HashSet<>();
        labels.add("срочно");
        labels.add("баг");
        labels.add("дизайн");
        labels.add("срочно");   // дубликат — не добавится
        System.out.println("Метки: " + labels);

        System.out.println("Есть метка 'баг'? " + labels.contains("баг"));
        labels.remove("баг");
        System.out.println("После удаления 'баг': " + labels);

        // Set с объектами своего класса — работает благодаря equals() и hashCode()
        Set<Task> uniqueTasks = new HashSet<>();
        uniqueTasks.add(new Task(10, "Купить домен", "TODO", 2));
        uniqueTasks.add(new Task(10, "Купить домен", "TODO", 2)); // тот же id
        System.out.println("Задач в Set (добавили 2 одинаковые): " + uniqueTasks.size());
    }
}

import java.util.*;

// Работа с List: ArrayList и LinkedList
public class ListDemo {

    public static List<Task> run() {
        System.out.println("===== LIST (ArrayList) =====");
        List<Task> tasks = new ArrayList<>();

        // добавление
        tasks.add(new Task(1, "Сделать дизайн", "TODO", 3));
        tasks.add(new Task(2, "Написать код", "IN_PROGRESS", 5));
        tasks.add(new Task(3, "Протестировать", "TODO", 4));
        tasks.add(new Task(4, "Написать отчёт", "DONE", 2));

        // получение по индексу
        System.out.println("Задача с индексом 1: " + tasks.get(1));

        // изменение
        tasks.set(0, new Task(1, "Сделать дизайн сайта", "IN_PROGRESS", 3));
        System.out.println("После изменения: " + tasks.get(0));

        // удаление
        tasks.remove(3);
        System.out.println("Размер после удаления: " + tasks.size());

        // 1) обычный for
        System.out.println("-- обычный for --");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }

        // 2) for-each
        System.out.println("-- for-each --");
        for (Task t : tasks) {
            System.out.println(t.getTitle());
        }

        // 3) Iterator
        System.out.println("-- Iterator --");
        Iterator<Task> it = tasks.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getStatus());
        }

        // LinkedList — история действий
        System.out.println("\n===== LinkedList (история действий) =====");
        LinkedList<String> history = new LinkedList<>();
        history.addLast("Создана задача 1");
        history.addLast("Создана задача 2");
        history.addFirst("Открыт проект");
        System.out.println("История: " + history);
        System.out.println("Первое действие: " + history.getFirst());
        history.removeFirst();
        System.out.println("После removeFirst: " + history);

        return tasks;
    }
}

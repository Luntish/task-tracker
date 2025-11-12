import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskAppCLI {
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command;
        int id = 1;

        System.out.println("Welcome to TaskAppCLI!");
        System.out.println("Commands: add, list, exit");


        while (true) {
            System.out.print("> ");
            command = scanner.nextLine();
            switch (command) {
                case "add" -> {
                    add(taskList);
                }
                case "list" -> list(taskList);

                default -> System.out.println("Unknown command");
            }
        }
    }

    private static void add(List<Task> tasks) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name:");
        Task newTask = new Task(scanner.nextLine());
        tasks.add(newTask);
    }

    private static void list(List<Task> tasks) {
        if (!tasks.isEmpty()) {
            for (Task task : tasks) {
                System.out.println(task);
            }
            return;
        }
        System.out.println("No tasks found");
    }
}
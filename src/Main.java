import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = 0;


        while (true) {
            System.out.println("Enter task");
            String userTask = scanner.nextLine();
            System.out.println("Adding task with id (" + userTask + ")");

            Task task = new Task().setDescription(userTask);
            task.setId(++id);
            System.out.println("Task added successfully with id: " + task.getId());


            System.out.println("Do you want to add another task? (y/n)");
            String answer = scanner.nextLine();
            if (answer.equals("n")) {
                break;
            }
        }
    }
}
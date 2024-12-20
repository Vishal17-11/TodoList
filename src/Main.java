import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        TodoList todo = new TodoList();

        boolean run = true;

        while(run){
            System.out.println("Todo App");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. GetAllTasks");
            System.out.println("4. To Mark the status");
            System.out.println("5. Exit");
            System.out.println("Choose the above options:  ");
            int choice = in.nextInt();
            in.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter the task description: ");
                    String Description = in.nextLine();
                    todo.addTask(Description);
                    break;

                case 2:
                    System.out.println("Enter the task index to remove :  ");
                    int index = in.nextInt();
                    if (index>=0){
                    todo.removeTask(index);}else{
                        System.out.println("Error");
                    }
                    break;
                case 3:
//
                        List<Tasks> Tasks = todo.getTasks();
                    if(!Tasks.isEmpty()) {
                    for (int i = 0; i < Tasks.size(); i++) {
                        Tasks task = Tasks.get(i);


                        System.out.printf("%d. %s [%s] ", i, task.getTask(), task.getTaskStatus() ? "Completed" : "Not Completed");
                    } }else{
                            System.out.println("There is no Tasks");
                        }

                    break;
                case 4:
                    System.out.println("Enter the task index to mark as completed:  ");
                    int PointIndex = in.nextInt();
                    todo.MarkAsCompleted(PointIndex);
                    break;
                case 5:
                    System.out.println("Thank you Bye bye.......");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }




        }

        in.close();









    }
}
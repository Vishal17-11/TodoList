import java.util.ArrayList;
import java.util.List;

public class TodoList {



   final private List<Tasks> tasks;

        public TodoList(){
            tasks = new ArrayList<>();
        }
    public void addTask(String Task){
        tasks.add(new Tasks(Task));
        System.out.println("Tasks added");
    }

    public void removeTask(int index){

           if(tasks.size()> index  && index >=0   ){
               tasks.remove(index);
               System.out.println("Task Removed..");
           }





    }

    public void MarkAsCompleted(int index) {
            tasks.get(index).setTaskStatus(true);
        System.out.println("Marked as done..");
    }


    public List<Tasks> getTasks() {
        return tasks;
    }
}

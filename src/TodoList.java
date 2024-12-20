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
           }





    }

    public void MarkAsCompleted(int index) {
            tasks.get(index).setTaskStatus(true);
    }


    public List<Tasks> getTasks() {
        return tasks;
    }
}

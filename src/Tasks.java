public class Tasks {




    String Task;

    boolean TaskStatus;

    public Tasks(String description){

        this.Task = description;
       this.TaskStatus = false;

    }

    public String getTask(){

        return  Task;

    }
    public   boolean getTaskStatus(){
            return TaskStatus;
    }
    public void setTaskStatus(boolean completed){

        TaskStatus = completed;

    }

}

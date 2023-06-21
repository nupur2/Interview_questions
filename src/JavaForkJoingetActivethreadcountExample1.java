import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

 class ForkJoin  extends RecursiveAction {

    private long Load = 0;

    public ForkJoin(long Load) { this.Load = Load; }

    @Override
    protected void compute() {
        List<ForkJoin> subtasks = new ArrayList<ForkJoin>();
        subtasks.addAll(createSubtasks());
        for(RecursiveAction action : subtasks){
            action.fork();
        }
    }


    private List<ForkJoin> createSubtasks()
    {
        // create subtasks
        List<ForkJoin> subtasks = new ArrayList<ForkJoin>();
        ForkJoin subtask1 = new ForkJoin(this.Load / 2);
        ForkJoin subtask2 = new ForkJoin(this.Load / 2);
        ForkJoin subtask3 = new ForkJoin(this.Load / 2);

        // to add the subtasks
        subtasks.add(subtask1);
        subtasks.add(subtask2);
        subtasks.add(subtask3);

        return subtasks;
    }
}
public class JavaForkJoingetActivethreadcountExample1 {
    public static void main(final String[] arguments){
        int proc = Runtime.getRuntime().availableProcessors();

        System.out.println("Number of available core in the processor is: "
                + proc);

        // get no. of threads active
        ForkJoinPool Pool = ForkJoinPool.commonPool();

        System.out.println("Number of active thread before invoking: "
                + Pool.getActiveThreadCount());

        ForkJoin t = new ForkJoin(400);

        Pool.execute(t);

        System.out.println("Number of active thread after invoking: "
                + Pool.getActiveThreadCount());
        System.out.println("Common Pool Size is: "
                + Pool.getPoolSize());
    }
    }


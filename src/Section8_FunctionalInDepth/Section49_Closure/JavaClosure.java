package Section8_FunctionalInDepth.Section49_Closure;

public class JavaClosure {
    public static void main(String[] args) {
        int val = 102;

        // This is closure
        Task task = () -> {
            System.out.println(val);
            System.out.println("Task completed!");
        };
        
        printValue(task);

    }

    private static void printValue(Task task) {
        task.performTask();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Capstone Project Phase 4 Testing ===");

        // Normal Test
        SmartScheduler scheduler = new SmartScheduler();
        scheduler.insert(new Task(1, "Low Priority Task", 1));
        scheduler.insert(new Task(2, "High Priority Task", 10));
        scheduler.insert(new Task(3, "Medium Priority Task", 5));

        Task result = scheduler.removeHighestPriority();
        System.out.println("\nNormal Test:");
        System.out.println("Expected priority: 10");
        System.out.println("Actual priority: " + result.getPriority());
        System.out.println(result.getPriority() == 10 ? "PASS" : "FAIL");

        // Empty Test
        SmartScheduler emptyScheduler = new SmartScheduler();
        Task emptyResult = emptyScheduler.removeHighestPriority();

        System.out.println("\nEmpty Test:");
        System.out.println("Expected: null");
        System.out.println("Actual: " + emptyResult);
        System.out.println(emptyResult == null ? "PASS" : "FAIL");

        // Edge Case Test
        SmartScheduler tieScheduler = new SmartScheduler();
        tieScheduler.insert(new Task(4, "Task A", 7));
        tieScheduler.insert(new Task(5, "Task B", 7));

        Task tieResult = tieScheduler.removeHighestPriority();

        System.out.println("\nEdge Case Test:");
        System.out.println("Expected priority: 7");
        System.out.println("Actual priority: " + tieResult.getPriority());
        System.out.println(tieResult.getPriority() == 7 ? "PASS" : "FAIL");
    }
}

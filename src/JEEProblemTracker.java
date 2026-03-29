import java.util.ArrayList;
import java.util.List;

public class JEEProblemTracker {
    private List<Problem> problems;

    public JEEProblemTracker() {
        this.problems = new ArrayList<>();
    }

    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    public List<Problem> getAllProblems() {
        return problems;
    }

    public static void main(String[] args) {
        System.out.println("JEE Practice Tracker initialized");
    }
}

import java.util.List;
import java.util.stream.Collectors;

public class ProblemFilter {

    public static List<Problem> filterByDifficulty(List<Problem> problems, String difficulty) {
        return problems.stream()
                .filter(p -> p.getDifficulty().equalsIgnoreCase(difficulty))
                .collect(Collectors.toList());
    }

    public static List<Problem> filterByTopic(List<Problem> problems, String topic) {
        return problems.stream()
                .filter(p -> p.getTopic().equalsIgnoreCase(topic))
                .collect(Collectors.toList());
    }

    public static List<Problem> filterSolved(List<Problem> problems) {
        return problems.stream()
                .filter(Problem::isSolved)
                .collect(Collectors.toList());
    }

    public static List<Problem> filterUnsolved(List<Problem> problems) {
        return problems.stream()
                .filter(p -> !p.isSolved())
                .collect(Collectors.toList());
    }
}

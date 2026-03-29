import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataPersistence {
    private static final String DATA_FILE = "problems.dat";

    public static void saveProblemList(List<Problem> problems) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(problems);
            System.out.println("Problems saved successfully");
        } catch (IOException e) {
            System.err.println("Error saving problems: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Problem> loadProblemList() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            return (List<Problem>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Data file not found, returning empty list");
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading problems: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}

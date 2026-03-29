public class Problem {
    private String title;
    private String topic;
    private String difficulty;
    private boolean solved;

    public Problem(String title, String topic, String difficulty) {
        this.title = title;
        this.topic = topic;
        this.difficulty = difficulty;
        this.solved = false;
    }

    public String getTitle() {
        return title;
    }

    public String getTopic() {
        return topic;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public boolean isSolved() {
        return solved;
    }

    public void markSolved() {
        this.solved = true;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "title='" + title + '\'' +
                ", topic='" + topic + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", solved=" + solved +
                '}';
    }
}

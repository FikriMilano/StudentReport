public class Subject {

    private String name;
    private double score;

    public Subject() {
        this.name = "";
        this.score = 0;
    }

    public Subject(String name, int score) {
        this.name = name;
        if (validateScore(score)) {
            this.score = score;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (validateScore(score)) {
            this.score = score;
        }
    }

    /**
     * Validate whether the given value is between the range of 0 until 100.
     *
     * @param score to be validated
     * @return {@code true} if the score is valid
     */
    private boolean validateScore(double score) {
        return 0 < score && score <= 100;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

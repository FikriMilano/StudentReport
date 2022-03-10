import java.util.ArrayList;
import java.util.Comparator;

public class Student {

    private String id;
    private String name;
    private ArrayList<Subject> subjects;
    private double totalScore;
    private String ranking;

    public Student(String id) {
        this.id = id;
        this.name = "";
        this.subjects = new ArrayList<>();
        this.totalScore = 0;
        this.ranking = "0";
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.subjects = new ArrayList<>();
        this.totalScore = 0;
        this.ranking = "0";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
        calculateTotalScore(this.subjects);
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
        calculateTotalScore(this.subjects);
    }

    public void removeSubject(Subject subject) {
        this.subjects.remove(subject);
        calculateTotalScore(this.subjects);
    }

    public void clearSubjects() {
        this.subjects.clear();
        this.totalScore = 0;
    }

    public double getTotalScore() {
        return totalScore;
    }

    private void calculateTotalScore(ArrayList<Subject> subjects) {
        for (Subject subject : subjects) {
            this.totalScore = subject.getScore() + this.totalScore;
        }
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                ", totalScore=" + totalScore +
                ", ranking='" + ranking + '\'' +
                '}';
    }
}

class TotalScoreDesComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getTotalScore(), o1.getTotalScore());
    }
}

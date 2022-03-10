import java.util.ArrayList;

public class Report {

    private ArrayList<Student> students;

    public Report() {
        this.students = new ArrayList<>();
    }

    public Report(ArrayList<Student> students) {
        this.students = students;
        decideRankings(this.students);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
        decideRankings(this.students);
    }

    public void addStudent(Student student) {
        this.students.add(student);
        decideRankings(this.students);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
        decideRankings(this.students);
    }

    public void clearStudents() {
        this.students.clear();
    }

    private void decideRankings(ArrayList<Student> students) {
        students.sort(new TotalScoreDesComparator());
        for (int i = 0; i < students.size(); i++) {
            String ranking = String.valueOf(i + 1);
            students.get(i).setRanking(ranking);
        }
    }

    public ArrayList<Student> searchStudentByName(String name) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().contains(name)) {
                result.add(student);
            }
        }
        return result;
    }
}

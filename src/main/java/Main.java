public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("S01", "ari");
        Subject math1 = new Subject("math", 80);
        Subject biology1 = new Subject("biology", 60);
        student1.addSubject(math1);
        student1.addSubject(biology1);

        Student student2 = new Student("S02", "ado");
        Subject math2 = new Subject("math", 100);
        Subject biology2 = new Subject("biology", 90);
        student2.addSubject(math2);
        student2.addSubject(biology2);

        Student student3 = new Student("S03", "boy");
        Subject math3 = new Subject("math", 60);
        Subject biology3 = new Subject("biology", 50);
        student3.addSubject(math3);
        student3.addSubject(biology3);

        Student student4 = new Student("S04", "cen");
        Subject math4 = new Subject("math", 80);
        Subject biology4 = new Subject("biology", 80);
        student4.addSubject(math4);
        student4.addSubject(biology4);

        Report report = new Report();
        report.addStudent(student1);
        report.addStudent(student2);
        report.addStudent(student3);
        report.addStudent(student4);


        // Test cases pls run below
        System.out.println("GET STUDENTS -> " + report.getStudents());

        System.out.println("SEARCH STUDENTS a -> " + report.searchStudentByName("a"));
        System.out.println("SEARCH STUDENTS ar -> " + report.searchStudentByName("ar"));
        System.out.println("SEARCH STUDENTS ari -> " + report.searchStudentByName("ari"));
        System.out.println("SEARCH STUDENTS ado -> " + report.searchStudentByName("ado"));
        System.out.println("SEARCH STUDENTS boy ->" + report.searchStudentByName("boy"));
        System.out.println("SEARCH STUDENTS cen -> " + report.searchStudentByName("cen"));
    }
}

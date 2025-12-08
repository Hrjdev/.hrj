public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali","050555","MAT");
        Teacher t2 = new Teacher("Veli","050565","DST");
        Teacher t3 = new Teacher("Serkan","050575","ALG");

        Course systems = new Course("Digital Systems","101","DST");
        Course algorithms = new Course("Algorithms","101","ALG");
        Course mat = new Course("Matematik","101","MAT");
        mat.setTeacher(t1);
        systems.setTeacher(t2);
        algorithms.setTeacher(t3);

        Student std1 = new Student("Serkan","22020304","Class1",mat,systems,algorithms);
        std1.addNotes(30,10,40,50,56,70);
        std1.printNotes();
        std1.isPass();






    }
}
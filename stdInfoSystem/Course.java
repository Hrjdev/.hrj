public class Course {
    String name;
    String code;
    String prefix;
    Integer note;
    Integer quizNote;
    Teacher teacher;


    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        Integer note = 0;
        Integer quizNote = 0;
    }
    void setTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            System.out.println("Teacher " +this.teacher.name + " is assigned successfully to the course : "+ this.prefix+this.code);
        }else {
            System.out.println("Teacher branch is not equal to course's");
        }
    }

    void printTeacherInfo(){
        this.teacher.printInfo();
    }

}

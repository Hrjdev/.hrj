public class Teacher {

    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void printInfo(){
        System.out.println("Teacher" +
                " name= " + name + '\n' +
                "mpno= " + mpno + '\n' +
                "branch= " + branch + '\n');
    }
}

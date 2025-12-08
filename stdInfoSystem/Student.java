public class Student {
    String name;
    String stdNo;
    String classes;
    Course c1,c2,c3;
    Double average;
    Boolean isPass;

    public Student(String name,String stdNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    void addNotes(int c1Note,int c1quizNote,int c2Note,int c2quizNote,int c3Note,int c3quizNote){
        if (c1Note >= 0 && c1Note < 100 && c1quizNote >= 0 && c1quizNote < 100 ){
            this.c1.note = (int)((c1Note * 0.8) + (c1quizNote * 0.2));
        }if (c2Note >= 0 && c2Note < 100 && c2quizNote >= 0 && c2quizNote < 100 ){
            this.c2.note = (int)((c2Note * 0.8) + (c2quizNote * 0.2));
        }if (c3Note >= 0 && c3Note < 100 && c3quizNote >= 0 && c3quizNote < 100 ){
            this.c3.note = (int)((c3Note * 0.8) + (c3quizNote * 0.2));
        }
    }
    void printNotes(){
        System.out.println(c1.name + " Ders Notu: "+ c1.note);
        System.out.println(c2.name + " Ders Notu: "+ c2.note);
        System.out.println(c3.name + " Ders Notu: "+ c3.note);
    }
    void isPass(){
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.average >= 40){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }



    }

}

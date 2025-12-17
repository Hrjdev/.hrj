public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if (this.salary > 1000){
            return (this.salary * 0.03);
        }else
            return 0;
    }
    public double bonus(){
        if (this.workHours > 40){
            return ((this.workHours-40)*30.0);
        }else return 0;

    }
    public double raiseSalary(){
        int totalWorkYear = 2021-this.hireYear;
        if (totalWorkYear<10){
            return this.salary*0.05;
        } else if (totalWorkYear <20) {
            return this.salary*0.10;
        }return this.salary*0.15;
    }
    public void toStr(){
        System.out.println("Adı : "+this.name+
                "\nMaaşı : "+this.salary+
                "\nÇalışma Saati : "+this.workHours+
                "\nBaşlangıç Yılı : "+this.hireYear+
                "\nVergi : "+tax()+
                "\nBonus : "+bonus()+
                "\nMaaş Artışı : "+raiseSalary()+
                "\nVergi ve bonuslar ile birlikte maaş : "+(this.salary+bonus()-tax())+
                "\nToplam Maaş : "+(this.salary+bonus()+raiseSalary()-tax()));
    }
}

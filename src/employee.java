

public class employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double bonus;
    double tax;
    double raise;
    int availableHireYear= 2021;

    employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    public void tax(){
        if (this.salary>1000){
            tax=(this.salary*0.03);
            System.out.println(tax);
        }else {
            tax=this.salary;
        }


    }
    public void bonus(){
        if (this.workHours>40){
            this.bonus=(this.workHours-40)*30;
            System.out.println(this.bonus);
        }else{
            this.bonus=0;
            System.out.println(this.bonus);
        }

    }

    public void raiseSalary(){
        if (availableHireYear-hireYear<10){
            this.raise=this.salary*0.05;

        } else if (availableHireYear-hireYear>9 && availableHireYear-hireYear<20) {
            this.raise=this.salary*0.1;

        } else if (availableHireYear-hireYear>19) {
            this.raise=this.salary*0.15;

        }else{
            System.out.println("Girdiğiniz değer çalışma yılına uygun bir yıl değildir.");
        }

    }

    public void toStrings(){
        System.out.println("Vergi: "+this.tax);
        System.out.println("Bonus: "+ this.bonus);
        System.out.println("Maaş Artışı: "+this.raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+(this.salary-this.tax+this.bonus));
        System.out.println("Toplam maaş: "+ (this.raise+this.salary));

    }


}

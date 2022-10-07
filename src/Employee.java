import java.util.Scanner;

public class Employee {



    static int raiseAmount;  //Maaş artış miktarı
    public static void main(String[] args){


            String name; // Çalışanın adı ve soyadı
            int salary, workHours, hireYear; // Çalışanın maaşı, Haftalık Çalışma Saati, işe başlangıç yılı

             Scanner input = new Scanner(System.in);
             System.out.println("Çalışan Adı ve Soyadı Giriniz : ");
             name = input.nextLine();

             System.out.println("Çalışanın Maaşını Giriniz : ");
             salary = input.nextInt();

             System.out.println("Çalışanın Haftalık Çalışma Saatini Giriniz : ");
             workHours = input.nextInt();

             System.out.println("Çalışanın İşe Başlangıç Yılını Giriniz : ");
             hireYear = input.nextInt();

            raiseSalary(hireYear,salary);
            int totalSalary =  tax(salary) + bonus(workHours) + salary;


            System.out.println("----------------");

            tooString(name,salary,workHours,hireYear);

    }






        public static int tax(int salary){


            if (salary>999){
                salary = (salary * 3)/100;
                //   System.out.println(salary);
            } else if (salary<1000) {
                salary = salary;
                //   System.out.println(salary);
            }

            return salary;
        }





    public static int bonus(int workHours) {

        int bonus;
        if (workHours > 39) {
            bonus = (workHours - 40) * 30;
            return bonus; // System.out.println("Bu bonusları gösterir:" + bonus);

        } else if (workHours < 40) {
            bonus = (workHours - 40) * 30;
        }
        return workHours;


    }





    public static void raiseSalary(int hireYear, int totalSalary){


        int currentYear = 2021;



        if (currentYear-hireYear<10){

            raiseAmount = (totalSalary *5)/100;
         //   System.out.println("Maaş Artış Miktarı" + raiseAmount);
      }

        else if (currentYear-hireYear>9 && currentYear-hireYear<20) {

            raiseAmount = (totalSalary *10)/100;

        }

        else if (currentYear-hireYear>19) {

            raiseAmount = (totalSalary *15)/100;

        }
    }


    public static void tooString(String name, int salary, int workHours, int hireYear){
        System.out.println("Çalışan Adı:" + name);
        System.out.println("Çalışan Maaşı: " + salary);
        System.out.println("Çalışma Saati: " + workHours);
        System.out.println("İşe Giriş Yılı: " + hireYear);

        if (salary>999){
            System.out.println("Çalışanın Ödediği vergi:" + tax(salary));
        } else if (salary<1000) {
            System.out.println("Çalışan Vergi Ödemiyor.");
        }

        System.out.println("Çalışanın Aldığı Bonus: " + bonus(workHours));

        System.out.println("Çalışanın Aldığı Maaş Artışı: " + raiseAmount);

        System.out.println("Vergi ve Bonuslarla birlikte Maaş: " + (bonus(workHours) + tax(salary) + salary));

        System.out.println("Toplam Maaş (Maaş Artışı dahil): "+ (bonus(workHours) + tax(salary) + salary + raiseAmount));



    }



}

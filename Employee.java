public class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public double tax() {
        //Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        if (salary<1000){
            return salary;
        }
        //Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
        else if (salary>1000) {
            return salary*0.03;
        }
        else{
            return 0;
        }
    }

    public double bonus() {
        //: Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
        int standardWorkHours =40;
        if (workHours>standardWorkHours){
            return (workHours-standardWorkHours)*30;
        }
        else {
            return 0;
        }
    }
    public double raiseSalary(){
        //Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
        int now = 2021;
        int howManyYearsWorking = now-hireYear;
        //Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        if (howManyYearsWorking<10){
            return salary*0.05;
        }
        //Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        if (howManyYearsWorking>9&&howManyYearsWorking<20){
            return salary*0.1;
        }
        //Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
        if (howManyYearsWorking>20){
            return salary*0.15;
        }
        else{
            return 0;}
    }
    public void myToStringMethod(){
        System.out.println("Çalışanın Adı : " +getName());
        System.out.println("Çalışanın Sabit Maaşı : " +getSalary()+" ₺");
        System.out.println("Çalışanın Haftalık Çalışma Saati : " + getWorkHours());
        System.out.println("Çalışanın İşe Başlangıç Yılı : " +getHireYear());
        System.out.println("Çalışanın Maaşına Düşen Vergi : "+tax() +" ₺");
        System.out.println("Çalışanın Kazandığı Haftalık Bonus : "+bonus()+" ₺");
        System.out.println("Çalışanın Hizmet Yılına Göre Maaşına Yapılan Zam : "+raiseSalary()+" ₺");
        System.out.println("Çalışanın Vergi ve Bonuslarla Toplam Maaşı : " +(getSalary()-tax()+bonus())+" ₺");
        System.out.println("Çalışanın Mevcut Toplam Maaşı : " +(getSalary()+raiseSalary()-tax()+bonus())+" ₺");
    }


}

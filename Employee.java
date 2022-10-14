public class Employee {

    String name;
    double salary;
    double workHours;
    int hireYear;

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
            return salary*1.05;
        }
        //Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        if (howManyYearsWorking>9&&howManyYearsWorking<20){
            return salary*1.1;
        }
        //Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
        if (howManyYearsWorking>20){
            return salary*1.15;
        }
        else{
        return 0;}
    }
    public void toStringMethod(){
        System.out.println("Çalışanın Adı : " +name);
        System.out.println("Çalışanın Sabit Maaşı : " +salary+" ₺");
        System.out.println("Çalışanın Haftalık Çalışma Saati : " + workHours);
        System.out.println("Çalışanın İşe Başlangıç Yılı : " +hireYear);
        System.out.println("Çalışanın Maaşına Düşen Vergi : "+tax() +" ₺");
        System.out.println("Çalışanın Kazandığı Haftalık Bonus : "+bonus()+" ₺");
        System.out.println("Çalışanın Hizmet Yılına Göre Zamlı Maaşı : "+raiseSalary()+" ₺");
        System.out.println("Çalışanın İş Verene Maaliyeti : " +(salary+tax()+bonus())+" ₺");
        System.out.println("Çalışanın Mevcut Toplam Maaşı : " +(salary+bonus())+" ₺");
    }


}

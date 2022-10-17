# ebebek Java&QA Practicum - First Case
---

## Case Detail : 
Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır. Sizden konsol çıktısı halinde Adı, maaşı, çalışma saati, başlangıç yılı, vergi, bonus, maaş artışı, vergi ve bonuslarla birlikte maaş, toplam maaş değerlerini konsola yazdırmanızı bekliyoruz.
Sınıfın Nitelikleri
* name : Çalışanın adı ve soyadı
* salary : Çalışanın maaşı
* workHours : Haftalık çalışma saati
* hireYear : İşe başlangıç yılı
Sınıfın Metotları
* Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
* tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
* bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
* raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
* toString() : Çalışana ait bilgileri ekrana bastıracaktır.
Notlar 
raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız.
tax() fonksiyonu ile sadece salary’i uygulanan vergi hesaplanacak
Toplam maaş: çalışanın kendi maaşı+ bonus
Vergi ve bonuslarla birlikte maaş için: vergi, bonus ve çalışanın kendi maaşı ile bulunacak.

# Code :
---

public class Main {
    public static void main(String[] args) {

        Employee employee0 = new Employee();
        employee0.name = "Ali Ateş";
        employee0.salary=  2825.90;
        employee0.workHours= 58.5;
        employee0.hireYear= 2006;
        employee0.toStringMethod();
    }
    }
    public class Employee {



    String name;
    double salary;
    double workHours;
    int hireYear;

    public double tax() {
        if (salary<1000){
            return salary;
        }
        else if (salary>1000) {
            return salary*0.03;
        }
        else{
        return 0;
        }
    }
    public double bonus() {
        int standardWorkHours =40;
        if (workHours>standardWorkHours){
            return (workHours-standardWorkHours)*30;
        }
        else {
        return 0;
        }
    }
    public double raiseSalary(){
        int now = 2021;
        int howManyYearsWorking = now-hireYear;
        if (howManyYearsWorking<10){
            return salary*1.05;
        }
        if (howManyYearsWorking>9&&howManyYearsWorking<20){
            return salary*1.1;
        }
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






 

// zad5 cena towaru (100zl-10tys zl), liczba rat (od 6 do 48)
// liczba rat (6-12) oprocentowanie 2.5% (13-24) 5%, (25-48) 10%
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("podaj cenę towaru ");
//        Scanner dane= new Scanner(System.in);
//        double cena= dane.nextInt();
//
//         if (cena>=100 && cena<=10000) {
//
//        System.out.println("cena towaru wynosi "+ cena);
//
//                System.out.println("podaj ilość rat ");
//                Scanner liczba = new Scanner(System.in);
//                double raty = liczba.nextInt();
//
//             if (raty >= 6 && raty <= 48) {
//
//                System.out.println("ilość rat wynosi " + raty);
//
//                double opr = 0;
//                double rata = 0;
//
//                    if (raty >= 6 && raty <= 12) {
//                        opr = 0.025 * cena;
//                        rata = (cena / raty) + opr;
//                        BigDecimal interest = BigDecimal.valueOf(rata);
//                        BigDecimal rounded = interest.setScale(2, BigDecimal.ROUND_HALF_UP);
//                        System.out.println("oprocentowanie wynosi 2.5% i wartość raty to " + rounded);
//                    } else if (raty > 12 && raty <= 24) {
//                        opr = 0.05 * cena;
//                        rata = (cena / raty) + opr;
//                        BigDecimal interest = BigDecimal.valueOf(rata);
//                        BigDecimal rounded = interest.setScale(2, BigDecimal.ROUND_HALF_UP);
//                        System.out.println("oprocentowanie wynosi 5% i wartość raty to " + rounded);
//                    } else if (raty > 24 && raty <= 48) {
//                        opr = 0.1 * cena;
//                        rata = (cena / raty) + opr;
//                        BigDecimal interest = BigDecimal.valueOf(rata);
//                        BigDecimal rounded = interest.setScale(2, BigDecimal.ROUND_HALF_UP);
//                        System.out.println("oprocentowanie wynosi 10% i wartość raty to " + rounded);
//                    }
//
//                    double koszt = 0;
//                    koszt = rata * raty;
//
//                    System.out.println("łączny koszt z ratami i odsetkami wynosi " + koszt);
//                } else {
//                    System.out.println("Proszę podać poprawne dane");
//                }
//            }
//
//        else{
//            System.out.println("Proszę podać poprawne dane");
//        }

//        System.out.println("kalkulator");
//
//        Scanner inp=new Scanner(System.in);
//        System.out.println("podaj 1 liczbę ");
//        double num1 = inp.nextDouble();
//
//        Scanner inp=new Scanner(System.in);
//        System.out.println("podaj znak operacji (+, -, *, /) " );
//        string znak= inp.next();
//
//        Scanner inp =new Scanner(System.in);
//        System.out.println("podaj 2 liczbę ");
//        double num2 = inp.nextDouble();
//
//        switch(znak){
//            case x:
//            znak= "+";
//                System.out.println("suma wynosi " + (num1+num2));
//                break;
//
//            case y:
//            znak="-";
//                System.out.println("odejmowanie wynosi " + (num1-num2));
//                break;
//
//            case z:
//            znak="/";
//
//            if(num2==0){
//                System.out.println("nie dzielimy przez zero idioto");
//            }
//            else{
//                System.out.println("dzielenie wynosi " + (num1/num2));
//            }
//                break;
//
//            case w:
//            znak="*";
//                System.out.println("mnożenie wynosi " + (num1*num2));
//                break;
//
//            default:
//                System.out.println("podany znak jest błędny");
//        }

//        System.out.println("Dwie liczby całkowite i suma ich ciągu");
//
//        Scanner l= new Scanner(System.in);
//
//        System.out.println("Podaj pierwszą liczbę: ");
//
//        int liczba = l.nextInt();
//
//        System.out.println("Podaj drugą liczbę: ");
//
//        int liczbb = l.nextInt();
//
//        if(liczba>liczbb){
//            System.out.println("Pierwsza liczba musi być mniejsza od drugiej ");
//        }
//        else{
//            int suma=0;
//            suma=liczbb-liczba;
//            int ciag=liczba;
//
//            for(int i=0; i<suma; i++){
//                ciag+=(i+liczba+1);
//            }
//
//            System.out.println("(for) Suma ciągu wynosi: "+ ciag);
//
//            int ciagw=0;
//
//            int i=liczba;
//            while( i<=liczbb){
//                ciagw+= i;
//                i++;
//            }
//
//            System.out.println("(while) Suma ciągu wynosi: "+ ciagw);
//
//            int ciagdw=0;
//
//            int j=liczba;
//
//            do{
//                ciagdw+=j;
//                j++;
//            }
//            while(j<=liczbb);
//
//
//
//            System.out.println("(do while) Suma ciągu wynosi: "+ciagdw);
//
//        }
//
//        System.out.println("program obliczajacy nalezny podatek dochodowy");
//
//        System.out.println("Podaj swój dochód: ");
//        Scanner input= new Scanner(System.in);
//        double dochod= input.nextDouble();
//
//        double podatek=0;
//
//
//
//            if (dochod < 85_528) {
//                podatek = (0.18 * dochod) - 556.02;
//                System.out.println("Należny podatek wynosi " + podatek + "zł");
//            } else if (dochod >= 85_528) {
//                double nadwyzka = dochod - 85_528;
//                podatek = 14_839.02 + 0.32 * nadwyzka;
//                System.out.println("Należny podatek wynosi " + (podatek) + "zł");
//            } else {
//                System.out.println("Proszę podać poprawne dane ");
//            }
//
    }
}


//multiplier do mnożników ofc
// shift strzalka zaznaczenie
// ctrl d duplikacja

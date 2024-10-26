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

        System.out.println("kalkulator");

        Scanner inp=new Scanner(System.in);
        System.out.println("podaj 1 liczbę ");
        double num1 = inp.nextInt;

        Scanner inp=new Scanner(System.in);
        System.out.println("podaj znak operacji (+, -, *, /) " );
        string znak= inp.nextInt;

        Scanner inp =new Scanner(System.in);
        System.out.println("podaj 2 liczbę ");
        double num2 = inp.nextInt;

        switch(znak){
            case x:
            znak= "+";
                System.out.println("suma wynosi " + (num1+num2));
                break;

            case y:
            znak="-";
                System.out.println("odejmowanie wynosi " + (num1-num2));
                break;

            case z:
            znak="/";

            if(num2==0){
                System.out.println("nie dzielimy przez zero idioto");
            }
            else{
                System.out.println("dzielenie wynosi " + (num1/num2));
            }
                break;

            case w:
            znak="*";
                System.out.println("mnożenie wynosi " + (num1*num2));
                break;

            default:
                System.out.println("podany znak jest błędny");
        }
    }
}
//multiplier do mnożników ofc
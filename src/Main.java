import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner wprowadzanie = new Scanner(System.in);


        int NumerZadania;
        do{
            System.out.print("\n--------------------------------------------------\n");
            System.out.print("Wybierz numer zadania\n");
            System.out.print("1. Zwracanie Imnienia oraz aktualnego wieku\n");
            System.out.print("2. Suma, roznica i iloczyn\n");
            System.out.print("3. Czy parzysta\n");
            System.out.print("4. Czy podzilena przez 3 i 5\n");
            System.out.print("5. Podnoszenie do 3 potegi\n");
            System.out.print("6. Pieriwastek kwadratowy\n");
            System.out.print("7. Czy mozna zbudowac trojkat?\n");
            System.out.print("0. Zakoncz dzialanie programu\n");


            NumerZadania = wprowadzanie.nextInt();
            switch (NumerZadania) {
                case 1:
                    System.out.println("Imie: "+ Imie() +" Wiek: "+Wiek());
                    break;
                case 2:
                    System.out.print("Wprowadz pierwsza liczbe: ");
                    int liczba1 = wprowadzanie.nextInt();
                    System.out.print("Wprowadz druga liczbe: ");
                    int liczba2 = wprowadzanie.nextInt();
                    Dzialania(liczba1,liczba2);
                    break;
                case 3:
                    System.out.print("Wprowadz liczbe do sprawdzenia czy jest parzysta: ");
                    int liczba3 = wprowadzanie.nextInt();
                    System.out.println("Czy parzysta: "+ CzyParzysta(liczba3));
                    break;
                case 4:
                    System.out.print("Wprowadz liczbe do sprawdzenia czy jest podzielna przez 3 i 5: ");
                    int liczba4 = wprowadzanie.nextInt();
                    System.out.println("Czy podzielna przez 3 i 5: "+ CzyPrzez5i3(liczba4));
                    break;
                case 5:
                    System.out.print("Wprowadz liczbe, ktora chcesz podniesc do 3 potegi: ");
                    int liczba5 = wprowadzanie.nextInt();
                    System.out.println("Liczba do potegi 3: "+ Potega(liczba5));
                    break;
                case 6:
                    System.out.print("Wprowadz liczbe, z ktorej chcesz otrzymac pierwiastek: ");
                    int liczba6 = wprowadzanie.nextInt();
                    System.out.println("Pierwiastek liczby: "+ Pierwiatek(liczba6));
                    break;
                case 7:
                    System.out.print("Wprowadz pierwsza liczbe przedzialu: ");
                    int x = wprowadzanie.nextInt();
                    System.out.print("Wprowadz druga liczbe przedzialu: ");
                    int y = wprowadzanie.nextInt();
                    double a = Losuj(x,y);
                    double b = Losuj(x,y);
                    double c = Losuj(x,y);
                    System.out.format("a = %.2f, b = %.2f, c = %.2f, ",a,b,c);
                    System.out.println("Czy da sie zbudowac trojkat: " + czyTrojkat(a,b,c));
                    break;
                case 0:
                    System.out.println("koniec programu.");
                    break; 
                default:
                    System.out.println("Nieprawidłowy numer zadania.");
                    break;
                }

            }while(NumerZadania !=0);
        }



    //Zadanie 1
    public static String Imie(){return "Michal";}
    public static int Wiek(){return 19;}
    //Zadanie 2
    public static void Dzialania(int c,int d){
        int suma = c + d;
        int roznica = c - d;
        int iloczyn = c * d;

        System.out.println("Suma: " + suma);
        System.out.println("Roznica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
    }
    //Zadanie 3
    public static boolean CzyParzysta(int a){
        if(a % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    //Zadanie 4
    public static boolean CzyPrzez5i3(int a){
        if(a % 3 == 0 && a % 5 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    //Zadanie 5
    public static double Potega(double a) {
        return Math.pow(a,3);
    }
    //Zadanie 6
    public static double Pierwiatek(double a) {
        return Math.sqrt(a);
    }
    //Zadanie 7
    public static boolean czyTrojkat(double a, double b, double c){
        if (a<1 || b<1 || c<1) {
            System.out.println("Boki trójkąta nie mogą być < 1");
            return false;
        }
        double longest = a;
        double side1= b;
        double side2=c;
        if (b>a && b>c){
            longest=b;
            side1=a;
            side2=c;
        }else if(c>a && c>b){
            longest = c;
            side1=a;
            side2=b;
        }
        return Math.pow(side1,2)+Math.pow(side2,2) == Math.pow(longest,2);
    }

    public static int Losuj(int x, int y){
        Random rand = new Random();
        if(x<=y){
            int liczba = rand.nextInt(y-x+1)+x;
            return liczba;
        }
        else {
            System.out.println("Podano bledny przedzial losowania");
            return 0;
        }
    }


}
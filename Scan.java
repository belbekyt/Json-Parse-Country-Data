import java.util.Scanner;

public class Scan {

    public static String countryName;
    public static void ScanCountry(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------Wybierz kraj-------------");
        System.out.println("1 - Niemcy");
        System.out.println("2 - Czechy");
        System.out.println("3 - Słowcaja");
        System.out.println("4 - Ukraina");
        System.out.println("5 - Białoruś");
        System.out.println("6 - Litwa");
        System.out.println("7 - Rosja");
        System.out.println("-----------------------------------------");
        int countryNum = scanner.nextInt();

        if(countryNum>7 || countryNum<1){
            countryNum=1;
        }

        switch(countryNum){
            case 1:
                countryName = "germany";
                break;
            case 2:
                countryName = "czech";
                break;
            case 3:
                countryName = "slovakia";
                break;
            case 4:
                countryName = "ukraine";
                break;
            case 5:
                countryName = "belarus";
                break;
            case 6:
                countryName = "lithuania";
                break;
            case 7:
                countryName = "russia";
                break;
        }
    }
}

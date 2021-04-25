public class Main {
    public static void main(String[] args){
        Scan.ScanCountry();

        String link = "https://restcountries.eu/rest/v2/name/"+Scan.countryName;
        Connection.setConnection("https://restcountries.eu/rest/v2/name/polska");
        Connection.setConnection(link);

        Comparison.compare();
    }
}

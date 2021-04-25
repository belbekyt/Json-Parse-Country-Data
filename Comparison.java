public class Comparison {
    public static void compare(){
        String country1name = Parse.names[0];
        int country1m2 = Parse.data[0];
        int country1ppl = Parse.data[1];

        String country2name = Parse.names[1];
        int country2m2 = Parse.data[2];
        int country2ppl = Parse.data[3];

        if(country1m2 > country2m2){
            int rr = country1m2-country2m2;
            System.out.println("Powierzchnia "+country1name+" jest większa od powierzchni "+country2name+" o "+rr+" kilometrów kwadratowych");
        }
        else{
            int rr = country2m2-country1m2;
            System.out.println("Powierzchnia "+country2name+" jest większa od powierzchni "+country1name+" o "+rr+" kilometrów kwadratowych");
        }

        if(country1ppl > country2ppl){
            int rr = country1ppl - country2ppl;
            System.out.println("Populacja "+country1name+" jest większa od populacji "+country2name+" o "+rr+" osób");
        }
        else{
            int rr = country2ppl - country1ppl;
            System.out.println("Populacja "+country2name+" jest większa od populacji "+country1name+" o "+rr+" osób");
        }
    }
}

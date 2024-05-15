public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String tekstsas = "   Labai tekstas    ";
        System.out.println(tekstsas);
        System.out.println(tekstsas.toUpperCase());
        System.out.println(tekstsas.toLowerCase());
//        System.out.println(tekstsas);
        System.out.println(tekstsas.charAt(2));
        System.out.println(tekstsas.length());
        System.out.println(tekstsas.trim());
        System.out.println(tekstsas.repeat(10));
        System.out.println(tekstsas.contains("ekst"));
        System.out.println(tekstsas.isBlank());// "", "   "
        System.out.println(tekstsas.isEmpty());// ""

        tekstsas = "labai tekstas";
        System.out.println(tekstsas.substring(1));
        System.out.println(tekstsas.substring(1,5));
        System.out.println(tekstsas.substring(1,2));
        System.out.println(tekstsas.replace("a","i"));
        System.out.println(tekstsas.replace("a","i").replace("e","o"));
        System.out.println(tekstsas.replaceFirst("a","i"));
        System.out.println(tekstsas.replaceAll("",""));
        String tekstas2 = "sdff35saDSdrff654sadfGS65asS1ergrf";
        System.out.println(tekstas2.replaceAll("[a-zA-Z]",""));
        String episode = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(episode);



    }
}
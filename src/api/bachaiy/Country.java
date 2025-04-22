package api.bachaiy;

public class Country {
    String name;
    String area;
    String population;
    String languages;
    String capital;
    String president;
    String  currency;
    String description;

    public Country(String name,String population,String languages,String capital,String president,String currency,String description){
this.name =name;
this.area =area;
this.population = population;
this.languages=languages;
this.capital=capital;
this.president=president;;
this.currency=currency;
this.description=description;
    }
    public void print(){
        System.out.println("страна:" + name);
        System.out.println("территория:" + area  + "km2");
        System.out.println("население:" + population);
        System.out.println("языки:" + languages);
        System.out.println("столица:" + capital);
        System.out.println("президент:" + president);
        System.out.println("валюта:" + currency);
        System.out.println("описание:" + description);

    }
}


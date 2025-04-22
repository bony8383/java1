package api.bachaiy;

public class CountryService {
    public Country getCountry(String name){
        if (name.equalsIgnoreCase("Kyrgyzstan")){
            return new Country(name,"7,272,279 ","Kyrgyz,Russian", "Bishkek","Sadyr Nurgojo uulu Japarov","som", "Kyrgyzstan is a small, landlocked, mountainous country in the very centre of Central Asia with an ethnically mixed population of roughly 5 million people (see Table 1 for characteristics of the country and its economy). Bishkek is the capital and largest city.");
        } else if (name.equalsIgnoreCase("Germany")) {
            return new Country(name, "83,555,478", "German", "Berlin", "Frank-Walter Steinmeier", "euro", "Germany is a developed country with a strong economy; it has the largest economy in Europe by nominal GDP. As a major force in several industrial, scientific and technological sectors, it is both the world's third-largest exporter and importer.");
        } else if (name.equalsIgnoreCase("Italy")) {
            return new Country(name,"")
        }
    }
}

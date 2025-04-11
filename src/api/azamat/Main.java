package api.azamat;

public class Main {
    public static void main(String[] args) {
        WeatherService service = new WeatherService();
        Weather weather = service.getWeather("Bishkek");
        weather.print();
    }
}

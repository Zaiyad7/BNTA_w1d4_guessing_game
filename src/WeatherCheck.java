public class WeatherCheck {
    public static void main(String[] args) {
        int temperature = 5;
        boolean currentlyRaining = true;

        if (temperature > 25 && !currentlyRaining) {
            System.out.println("wear shots and sunscreen");
        } else if (temperature < 10 && currentlyRaining) {
            System.out.println("wear a waterproof coat");

    }
}
}

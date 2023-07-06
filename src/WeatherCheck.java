public class WeatherCheck{
    public static void main(String[] args) {

        int temperature = 24;
        boolean currentlyRaining = false;

//        String recommend = temperature <= 10 && currentlyRaining ? "Wear a thick raincoat!" : temperature <=10 && !currentlyRaining ? "Wear a thick woolly coat!" : temperature > 10 && temperature <16 && currentlyRaining ? "Just bring an umbrella and wear jeans." : temperature > 10 && temperature < 16 && !currentlyRaining ? "Long sleeved top with jeans will do fine." : temperature >= 16 && temperature <20 && currentlyRaining ? "Umbrella and shorts woo!" : temperature >= 16 && temperature < 20 && !currentlyRaining ? "T Shirt and shorts, its holiday time!" : "Time for a BBQ, rain can't stop us now! Bring your sunglasses, short shorts and tank tops.";
//        System.out.println(recommend);

        //above is messier?

        if(temperature <= 10) {
            if(currentlyRaining) {
                System.out.println("Wear a thick raincoat!");
            } else{
                System.out.println("Wear a thick woolly coat!");
            }
        } else if(temperature > 10 && temperature < 16){
            if(currentlyRaining) {
                System.out.println("Just bring an umbrella and wear jeans.");
            } else {
                System.out.printf("Long sleeved top with jeans will do fine.");
            }
        } else if(temperature >= 16 && temperature < 20){
            if(currentlyRaining) {
                System.out.printf("Umbrella and shorts woo!");
            } else {
                System.out.printf("T Shirt and shorts, its holiday time!");
            }
        } else{
            System.out.printf("Time for a BBQ, rain can't stop us now! Bring your sunglasses, short shorts and tank tops.");
        }

    }
}
public class Mooncoding {
    public static void main(String[] args) {
        // Problem 1
        double distance = 380000;  
        double speed = 10;         

        double timeSeconds = distance / speed;   
        double timeHours = timeSeconds / 3600;    

        System.out.println("Time to reach the Moon: " + timeHours + " hours");
        

        //Problem 2:
        double horizontal = 2000;  
        double vertical = 3000;    

        double totalChange = Math.sqrt((horizontal * horizontal) + (vertical * vertical));

        System.out.println("Total speed change needed: " + totalChange + " m/sec");


        //Problem 3:

        double radiusKm = 1731;
        double radiusMeters = radiusKm * 1000;
        double thickness = 0.001; 
        double pi = 3.14;
        double surfaceArea = 4 * pi * radiusMeters * radiusMeters;
        double surfaceVolume = surfaceArea * thickness;
        System.out.println("Surface volume 1 mm layer: " + surfaceVolume + " cubic meters");
        double density = 3000;  
        double regolithMassKg = surfaceVolume * density;
        double regolithMassTons = regolithMassKg / 1000;
        System.out.println("Regolith mass: " + regolithMassTons + " metric tons");
        double waterFraction = 0.25;  
        double waterMassKg = regolithMassKg * waterFraction;
        double waterLiters = waterMassKg;
        System.out.println("Water volume: " + waterLiters + " liters");
    }

}

      
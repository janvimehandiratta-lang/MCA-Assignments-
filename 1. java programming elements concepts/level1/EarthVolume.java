public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;   // Radius in kilometers
        double kmToMiles = 0.621371;  // 1 km = 0.621371 miles

        // Volume formula: (4/3) * π * r^3
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles, then calculate volume
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                           " and cubic miles is " + volumeMiles);
    }
}

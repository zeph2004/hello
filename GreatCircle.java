public class GreatCircle {
    public static void main(String[] args) {
        double latitude1 = Double.parseDouble(args[0]);
        double longitude1 = Double.parseDouble(args[1]);
        double latitude2 = Double.parseDouble(args[2]);
        double longitude2 = Double.parseDouble(args[3]);

        double lat1 = Math.toRadians(latitude1);
        double lon1 = Math.toRadians(longitude1);
        double lat2 = Math.toRadians(latitude2);
        double lon2 = Math.toRadians(longitude2);

        double halfLatDifference = (lat2 - lat1) / 2.0;
        double halfLonDifference = (lon2 - lon1) / 2.0;

        double a =
                Math.sin(halfLatDifference) * Math.sin(halfLatDifference) +
                Math.cos(lat1) * Math.cos(lat2) *
                Math.sin(halfLonDifference) * Math.sin(halfLonDifference);

        double distance = 2 * 6371.0 * Math.asin(Math.sqrt(a));
        System.out.println(distance + " kilometers");
    }
}
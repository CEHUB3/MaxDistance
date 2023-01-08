//Skriv metoden i denna klass
public class MaxDistanceFinder {

    public static double maxDistance(Place[] arrayInstans) {

        double maxDistance = 0;
        for (int i = 0; i < arrayInstans.length; i++) {
            for (int j = i + 1; j < arrayInstans.length; j++) {
                double distancePP = arrayInstans[i].distanceTo(arrayInstans[j]);
                if (distancePP > maxDistance) {
                    maxDistance = distancePP;
                }
            }
        }
        return maxDistance;

    }
}
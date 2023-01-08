//Skriv metoden i denna klass
public class MaxDistanceFinder {

    public double maxDistance(Place [] arrayInstans){

        int comparedIndex = 1;
        for (int i=0; i<arrayInstans.length; i=i+1){

            double distancePP = arrayInstans[i].distanceTo(arrayInstans[i+comparedIndex];

            comparedIndex = comparedIndex+1;


        }

    }
}
// Denna klass ingår INTE i uppgiften, utan är tänkt att användas
// av dig om du vill testköra koden med dina egna tester. 
// Klicka på "raketen" för att kompilera och köra detta program.
public class TestProgram {

	public static void main(String[] args) {
		System.out.println("**********************************************************");
		System.out.println("* Obs! detta är bara en testkörning av dina egna tester. *");
		System.out.println("* För att få poäng på frågan måste du köra utvärderingen.*");
		System.out.println("* (Ikonen med en kryssruta och en siffra.)               *");
		System.out.println("**********************************************************");
		System.out.println();

		Place p1 = new Place("Origo", 0, 0);
		Place p2 = new Place("Utopia", 3, 4);
		Place p3 = new Place("Mars", 5, 6);

		Place[] placeList = new Place[3] ;

		placeList[0] = p1;
		placeList[1] = p2;
		placeList[2] = p3;

		double distanceP1P2 = p1.distanceTo(p2);
		System.out.println(distanceP1P2);


		//public int maxDistance(placeList){


		}

	}



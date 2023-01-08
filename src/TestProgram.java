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
		Place p3 = new Place("Mars", 5, 7);
		Place p4 = new Place("Mars", 6, 8);
		Place p5 = new Place("Mars", 2, 8);
		Place p6 = new Place("Mars", 11, 5);
		Place p7 = new Place("Mars", 4, 7);
		Place p8 = new Place("Mars", 3, 1);

		Place[] placeList = new Place[3] ;

		placeList[0] = p1;
		placeList[1] = p2;
		placeList[2] = p3;
		placeList[3] = p4;
		placeList[4] = p5;
		placeList[5] = p6;
		placeList[6] = p7;
		placeList[7] = p8;

		double distanceP1P2 = p1.distanceTo(p2);
		System.out.println(distanceP1P2);
		double distanceP1P3 = p1.distanceTo(p3);
		System.out.println(distanceP1P3);
		double distanceP2P3 = p2.distanceTo(p3);
		System.out.println(distanceP2P3);


		//public int maxDistance(placeList){


		}

	}



package campday2;

public class Main {

	public static void main(String[] args) {
		
		Films filmler1 = new Films(1,"Judas and the Black Messiah",7.6,"Shaka King"); //referans kýsmý
		
		Films filmler2 = new Films(2,"Mank",6.9,"David Fincher");
		
		Films filmler3 = new Films(3,"Nomadland",7.5,"Chloé Zhao");
		
		Films filmler4 = new Films(4,"Promising Young Woman",7.5,"Emerald Fennell");

		Films filmler5 = new Films(5,"Sound of Metal",7.8,"Darius Marder");
		
		Films filmler6 = new Films(6,"Minari",7.6,"Lee Isaac Chung");
		
		Films filmler7 = new Films(7,"The Father",8.3,"Florian Zeller");
		
		Films filmler8 = new Films(8,"The Trial of the Chicago 7",7.8,"Aaron Sorkin");
		
		
		
		
		Films[] filmler = {filmler1,filmler2,filmler3,filmler4,filmler5,filmler6,filmler7,filmler8,};
		
		
		
		for (Films films : filmler) {

			System.out.println(films.id);
			System.out.println(films.name);
			System.out.println(films.IMDb);
			System.out.println(films.director);
			System.out.println("                       ");	
			
			
		}
		System.out.println("Bu yýl aday gösterilen film sayýsý:");
		System.out.println(filmler.length);
		
		
		Catagory catagory1 = new Catagory();
		catagory1.id = 1;
		catagory1.name = "ÖdüllüFilmler";
		
		

		
		FilmsManager filmsManager = new FilmsManager();
		filmsManager.reward(filmler3);



				
		
	}

}

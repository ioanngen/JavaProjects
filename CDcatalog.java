import java.io.*;
import java.util.*;

/**
* This class demonstrates the methods of the disk class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class disk{
	private String catalog;
	private String title;
	private String composer;
	private String type;
	
	/**
	* Default constructor.
	* @param a The catalog
	* @param b The title
	* @param c The composer
	* @param d The type
	*/	
	disk(String a, String b, String c, String d){
		catalog = a;
		title = b;
		composer = c;
		type = d;
	}
	/**
	* Default constructor.
	* @param a The catalog
	* @param b The title
	*/	
	disk(String a, String b){
		catalog = a;
		title = b;
	}
	
	/**
	* This method returns the catalog of disk.
	* @return catalog
	*/
	String getCatalog(){
		return catalog;
	}
	/**
	* This method returns the title of disk.
	* @return title
	*/
	String getTitle(){
		return title;
	}
	/**
	* This method returns the composer of disk.
	* @return composer
	*/
	String getComposer(){
		return composer;
	}
	/**
	* This method returns the type of disk.
	* @return type
	*/
	String getType(){
		return type;
	}
	
	/**
	* This method sets the catalog.
	* @param w The catalog of disk.
	*/
	void setCatalog(String x){
		catalog=x;
	}
	/**
	* This method sets the title.
	* @param w The title of disk.
	*/
	void setTitle(String x){
		title=x;
	}
	/**
	* This method sets the composer.
	* @param w The composer of disk.
	*/
	void setComposer(String x){
		composer=x;
	}
	/**
	* This method sets the type.
	* @param w The type of disk.
	*/
	void setType(String x){
		type=x;
	}
}

/**
* This class demonstrates the methods of the track class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class track extends disk{
	private String tracks;
	
	/**
	* Default constructor.
	* @param a The catalog
	* @param b The title
	* @param c The tracks
	*/
	track(String a, String b, String c){
		super(a, c);
		tracks = b;
	}
	
	/**
	* This method returns the tracks of track.
	* @return tracks
	*/
	String getTracks(){
		return tracks;
	}
	/**
	* This method sets the tracks.
	* @param x The tracks of track.
	*/
	void setTracks(String x){
		tracks=x;
	}
}

/**
* This class demonstrates the methods of the CDcatalog class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class CDcatalog {
	
	/**
	* This method prints the menu of the propramm to the console.
	*/
	static void menu(){
		// This is a function that prints the menu
		System.out.println("----------------------------- Menu ------------------------------");
		System.out.println("-------- 1 - Search by disk, composer, music or track -----------");
		System.out.println("-------- 2 - Insert or Renew Data -------------------------------");
		System.out.println("-------- 3 - Insert Data from csv -------------------------------");
		System.out.println("-------- 4 - Export Data to csv ---------------------------------");
		System.out.println("-------- Or Exit ------------------------------------------------");
		System.out.print("Your selection: ");
	}
	
	/**
	* This is the main method.
	* @param args Unused.
	*/
	public static void main(String args[]) { 
		
		Vector<disk> CDs = new Vector<disk>();
		Vector<track> Tracks = new Vector<track>();
		
		disk D1 = new disk("LP14", "EXILE ON MAIN ST", "THE ROLLING STONES", "ROCK & ROLL");
		CDs.add(D1);
		disk D2 = new disk("LP23", "COLTRANE LIVE AT THE VILLAGE VANGUARD", "JOHN COLTRANE", "JAZZ");
		CDs.add(D2);
		disk D3 = new disk("CD27", "STRING QUARTETS OPP. 131 & 132", "LUDWIG VAN BEETHOVEN", "CLASSICAL");
		CDs.add(D3);
		disk D4 = new disk("LP35", "RETURN TO FOREVER", "CHICK COREA", "JAZZ");
		CDs.add(D4);
		disk D5 = new disk("CD5", "THE BEST OF BLUE NOTE", "VARIOUS", "BLUES");
		CDs.add(D5);
		
		track T1 = new track("LP14", "D1_S1_1", "ROCKS OFF");
		Tracks.add(T1);
		track T2 = new track("LP14", "D1_S1_2", "RIP THIS JOINT");
		Tracks.add(T2);
		track T3 = new track("LP14", "S2_1", "SWEET VIRGIINIA");
		Tracks.add(T3);
		track T4 = new track("LP23", "S1_1", "SPIRITUAL");
		Tracks.add(T4);
		track T5 = new track("LP23", "S1_2", "SOFTLY AS IN A MORNING");
		Tracks.add(T5);
		track T6 = new track("LP35", "S1_1", "RETURN TO FOREVER");
		Tracks.add(T6);
		track T7 = new track("LP35", "S1_2", "CRYSTAL SILENCE");
		Tracks.add(T7);
		track T8 = new track("CD27", "S1_1", "ADAGIO MA NON TROPPO E MOLTO ESPRESSIVO");
		Tracks.add(T8);
		track T9 = new track("CD5", "D1_1", "SUMMERTIME");
		Tracks.add(T9);
		
		menu();
		Scanner choice = new Scanner(System.in);
		String anw;
		while(choice.hasNext()){
			anw = choice.next();
			if ( anw.matches("1") ) {
				Scanner input = new Scanner(System.in);
				System.out.println("Type the disk, composer, music or track to start searching: ");
				String search = input.next();
				boolean flag=false;
				for (disk D : CDs){
					if (D.getCatalog() == search || D.getComposer() == search || D.getType() == search || D.getTitle() == search){
						System.out.println("Catalog: " + D.getCatalog() + ", Title: " + D.getTitle() + ", Composer: " + D.getComposer() + ", Type: " + D.getType());
						flag=true;
					}
				}
				if(!flag){
					System.out.println("Program weren't able to find " + search);
				}
				input.close();
			}else if ( anw.matches("2") ) {
				Scanner input = new Scanner(System.in);
				System.out.println("Type the Catalog to update the data of Disk database: ");
				String search = input.next();
				boolean flag=false;
				for (disk D : CDs){
					if (D.getCatalog() == search){
						System.out.println("Enter new Title, Composer, and Type: ");
						D.setTitle(input.next());
						D.setComposer(input.next());
						D.setType(input.next());
						flag=true;
					}
				if(!flag){
					System.out.println("Program weren't able to find " + search);
				}
				}
				System.out.println("Type the Catalog to update the data of Tracks database: ");
				search = input.next();
				flag=false;
				for (track T : Tracks){
					if (T.getCatalog() == search){
						System.out.println("Enter new Tracks, Title: ");
						T.setTracks(input.next());
						T.setTitle(input.next());
					}
				if(!flag){
					System.out.println("Program weren't able to find " + search);
				}
				}
				input.close();
				
			}else if ( anw.matches("3") ) {
				
				Scanner input = new Scanner(System.in);
				System.out.println("Give the csv filename that you import data into Disk database: ");
				try
				{
					//parsing a CSV file into Scanner class constructor  
					Scanner sc = new Scanner(new File(input.next()));  
					sc.useDelimiter(";");   //sets the delimiter pattern  
					while (sc.hasNext()) { //returns a boolean value 
						disk D = new disk(sc.next(), sc.next(), sc.next(), sc.next());
						CDs.add(D);
					}   
					sc.close();  //closes the scanner  
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("Give the csv filename that you import data into Tracks database: ");
				try
				{
					//parsing a CSV file into Scanner class constructor  
					Scanner sc = new Scanner(new File(input.next()));  
					sc.useDelimiter(";");   //sets the delimiter pattern  
					while (sc.hasNext()) { //returns a boolean value
						track T = new track(sc.next(), sc.next(), sc.next());
						Tracks.add(T);
					}   
					sc.close();  //closes the scanner  
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				input.close();
				
			}else if ( anw.matches("4") ) {
				
				Scanner filename = new Scanner(System.in);
				try {
					System.out.println("Give the csv filename that you want to save the database Disk: ");
					FileWriter fileWriter = new FileWriter(filename.next());
					 
					//Write a new Disks object list to the CSV file
					for (disk D : CDs) {
						fileWriter.append(D.getCatalog());
						fileWriter.append(';');
						fileWriter.append(D.getTitle());
						fileWriter.append(';');
						fileWriter.append(D.getComposer());
						fileWriter.append(';');
						fileWriter.append(D.getType());
						fileWriter.append('\n');
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					System.out.println("Give the csv filename that you want to save the database Tracks: ");
					FileWriter fileWriter = new FileWriter(filename.next());
					 
					//Write a new Tracks object list to the CSV file
					for (track T : Tracks) {
						fileWriter.append(T.getCatalog());
						fileWriter.append(';');
						fileWriter.append(T.getTracks());
						fileWriter.append(';');
						fileWriter.append(T.getTitle());
						fileWriter.append('\n');
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else if ( anw.matches("exit") || anw.matches("EXIT") || anw.matches("Exit") ) {
				System.out.println("Now exiting...");
				break;
			}else {
				System.out.println("You have entered wrong input. Please read the menu and try again. ");
			}
			menu();
		}
		choice.close();
	}
}	

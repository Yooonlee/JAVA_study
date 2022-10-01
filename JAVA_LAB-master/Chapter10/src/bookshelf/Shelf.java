package bookshelf;

import java.util.ArrayList;

<<<<<<< HEAD
public class  Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
		
=======
public class Shelf {

	protected ArrayList<String> shelf;
	
	public Shelf(){
		shelf = new ArrayList<String>();
>>>>>>> 4abdbc8 (d)
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
<<<<<<< HEAD
	public int getCount() {
=======
	public int getCount(){
>>>>>>> 4abdbc8 (d)
		return shelf.size();
	}
}

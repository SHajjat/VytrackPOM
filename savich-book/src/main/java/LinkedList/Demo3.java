package LinkedList;

import java.util.*;

public class Demo3 {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<>();
		addInOrder(placesToVisit,"Sydney");
		addInOrder(placesToVisit,"Melburne");
		addInOrder(placesToVisit,"Sydney");
		addInOrder(placesToVisit,"Canberra");
		addInOrder(placesToVisit,"Darwin");
		addInOrder(placesToVisit,"Canberra");
		addInOrder(placesToVisit,"Alicee Springs");
		printList(placesToVisit);
		visit(placesToVisit);
//		placesToVisit.add(1,"Alicee Springs");
//		printList(placesToVisit);
//
//
//		placesToVisit.remove(4);
//		printList(placesToVisit);
	}
	
	private static void printList(LinkedList<String> placesToVisit) {
		Iterator<String> i = placesToVisit.iterator();
		while (i.hasNext()){
			System.out.println("Now visiting "+i.next());
		}
		System.out.println("*******************");
	}
	
	//this will add the list in organized way, so if they are equal do not add
	//if its smalled it will add before , if its bigger it will add after
	private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
		ListIterator<String> stringListIterator = linkedList.listIterator();
		while (stringListIterator.hasNext()){
			int comparison = stringListIterator.next().compareTo(newCity);
			if(comparison ==0){
				//equal , do not add
				System.out.println(newCity + " is already included as a destination" );
				return false;
			}else if (comparison >0){
				//this mean the new city is smaller so should appear before
				//Brisbane -> Adelaide
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			}else if(comparison <0){
				//move to the next city
			}
		}
		stringListIterator.add(newCity);
		return true;
	}
	private static void visit(LinkedList cities){
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
		boolean quite = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		if(cities.isEmpty()){
			System.out.println("no cities in the itenary");
			return;
		}else{
			System.out.println("now visiting "+listIterator.next());
			printMenu();
		}
		while (!quite){
			int action = scan.nextInt();
			scan.nextLine();
			switch (action) {
				case 0:
					System.out.println("Holiday over");
					quite = true;
					break;
				case 1:
					if(!goingForward){
						if ( listIterator.hasNext() ){
							listIterator.next();
						}
						goingForward= true;
					}
					if ( listIterator.hasNext() ) {
						System.out.println("visiting " + listIterator.next());
					} else {
						System.out.println("Reached the end of the list");
						goingForward=false;
					}
					break;
				
				case 2:
					if(goingForward){
						if(listIterator.hasPrevious()){
							listIterator.previous();
							
						}
						goingForward= false;
					}
					
					if ( listIterator.hasPrevious() ) {
						System.out.println("Now visiting " + listIterator.previous());
					}else {
						System.out.println("you are at the start of the list");
						goingForward = true;
					}
					break;
					
				case 3:
					printMenu();
					break;
			}
			
		}
		
	}
	
	private static void printMenu() {
		System.out.println("Available options");
		System.out.println("0 - to quite");
		System.out.println("1 - next city");
		System.out.println("2 - previous city");
		System.out.println("3 - print menu");
		
	}
}

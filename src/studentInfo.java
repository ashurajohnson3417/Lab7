
//Ashura Johnson
//GC Java Bootcamp
//Lab7
import java.util.Scanner;

public class studentInfo {

	public static void main(String[] args) {
		String[] homeTown = { "Detroit", "Lansing", "Chicago", "Austin" };
		String[] favoriteFood = { "Salads", "Hot dog", "Cheeseburger", "Pizza" };

		Scanner userInput = new Scanner(System.in);
		boolean go = true;
		while (go) {
			System.out.println("Welcome to our Java class! Which student would you like to learn more about?");
			System.out.println("Jill, Jack, Lisa or Chad?");
			String student = userInput.nextLine();
			if (student.equalsIgnoreCase("Jill")) {
				System.out.println("What do you want to know about " + student + "? Hometown or fav food?");
				boolean error = true;
				while (error) {
					String info = userInput.nextLine();
					if (info.charAt(0) == 'h') {
						System.out.println(student + " is from " + homeTown[0]);
						error = false;
					} else if (info.charAt(0) == 'f') {
						System.out.println(student + "'s fav food are " + favoriteFood[0]);
						error = false;
					} else {
						System.out.println("That data does not exist. Please try again. Would you like to know "
								+ student + "'s hometown or fav food?");
						error = true;
					}
				}
			} else if (student.equalsIgnoreCase("Jack")) {
				System.out.println("What do you want to know about " + student + "? Hometown or fav food?");
				boolean error1 = true;
				while (error1) {
					String info = userInput.nextLine();
					if (info.charAt(0) == 'h') {
						System.out.println(student + " is from " + homeTown[1]);
						error1 = false;
					} else if (info.charAt(0) == 'f') {
						System.out.println(student + " 's fav food is " + favoriteFood[1]);
						error1 = false;
					} else {
						System.out.println("That data does not exist. Please try again. Would you like to know "
								+ student + "'s hometown or fav food?");
						error1 = true;
					}
				}
			} else if (student.equalsIgnoreCase("Lisa")) {
				System.out.println("What do you want to know about " + student + "? Hometown or fav food?");
				boolean error2 = true;
				while (error2) {
					String info = userInput.nextLine();
					if (info.charAt(0) == 'h') {
						System.out.println(student + " is from " + homeTown[2]);
						error2 = false;
					} else if (info.charAt(0) == 'f') {
						System.out.println(student + " 's fav food is " + favoriteFood[2]);
						error2 = false;
					} else {
						System.out.println("That data does not exist. Please try again. Would you like to know "
								+ student + "'s hometown or fav food?");
						error2 = true;
					}
				}
			} else if (student.equalsIgnoreCase("Chad")) {
				System.out.println("What do you want to know about " + student + "? Hometown or fav food?");
				boolean error3 = true;
				while (error3) {
					String info = userInput.nextLine();
					if (info.charAt(0) == 'h') {
						System.out.println(student + " is from " + homeTown[3]);
						error3 = false;
					} else if (info.charAt(0) == 'f') {
						System.out.println(student + " 's fav food is " + favoriteFood[3]);
						error3 = false;
					} else {
						System.out.println("That data does not exist. Please try again. Would you like to know "
								+ student + "'s hometown or fav food?");
						error3 = true;
					}
				}
			} else {
				System.out.println("That data does not exist.");
				continue;
			}
			boolean error4 = true;
			while (error4) {
				System.out.println("Would you like to learn info about another student? Y or N");
				String learnMore = userInput.nextLine();
				if (learnMore.charAt(0) == 'y') {
					error4 = false;
					go = true;
				} else if (learnMore.charAt(0) == 'n') {
					System.out.println("See you next time!");
					error4 = false;
					go = false;
					break;
				} else {
					System.out.println("Not a valid choice!");
					continue;
				}
			}
		}
	}
}



	import java.util.*;

	public class VoterIDSystem {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // HashSet for storing unique voter IDs
	        HashSet<String> voterIDs = new HashSet<>();

	        int choice;
	        do {
	            System.out.println("\n========= MENU =========");
	            System.out.println("1. Unique Voter ID System");
	            System.out.println("2. Unique Word Counter");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1: // Voter ID system
	                    int subChoice;
	                    do {
	                        System.out.println("\n--- Voter ID System ---");
	                        System.out.println("1. Add Voter ID");
	                        System.out.println("2. Display Voter IDs");
	                        System.out.println("3. Back to Main Menu");
	                        System.out.print("Enter your choice: ");
	                        subChoice = sc.nextInt();
	                        sc.nextLine(); // consume newline

	                        switch (subChoice) {
	                            case 1:
	                                System.out.print("Enter Voter ID: ");
	                                String id = sc.nextLine();
	                                if (voterIDs.add(id)) {
	                                    System.out.println("✅ Voter ID added successfully.");
	                                } else {
	                                    System.out.println("⚠️ Duplicate ID! Not added.");
	                                }
	                                break;
	                            case 2:
	                                System.out.println("All Voter IDs: " + voterIDs);
	                                break;
	                            case 3:
	                                System.out.println("Returning to Main Menu...");
	                                break;
	                            default:
	                                System.out.println("Invalid choice!");
	                        }
	                    } while (subChoice != 3);
	                    break;

	                case 2: // Unique Word Counter
	                    System.out.println("\n--- Unique Word Counter ---");
	                    System.out.print("Enter a paragraph: ");
	                    String paragraph = sc.nextLine();

	                    // Split words (non-word characters are delimiters)
	                    String[] words = paragraph.split("\\W+");

	                    // Use Set for unique words
	                    Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

	                    System.out.println("Unique Words: " + uniqueWords);
	                    System.out.println("Word Count: " + uniqueWords.size());
	                    break;

	                case 3:
	                    System.out.println("Exiting program... 👋");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }

	        } while (choice != 3);

	        sc.close();
	    }
	}



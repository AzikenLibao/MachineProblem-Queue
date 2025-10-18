
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Queue<Ticket> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
System.out.println("Welcome to the IT Support Ticketing System!");
        System.out.println();

        for (int i = 1; i <= 3; i++) {

        System.out.println("--- Enter Ticket Details ---");
            System.out.println("Please enter details for ticket " + i + " of 3.");
            System.out.print("Enter your name: ");

String name = scanner.nextLine();
            System.out.print("Describe your issue: ");
String issue = scanner.nextLine();
            System.out.println();

Ticket ticket = new Ticket(name, issue);
            queue.add(ticket);
        }

                System.out.println("-------------------------------------------");
        System.out.println("All tickets have been logged.");
        System.out.println("There are " + queue.size() + " tickets waiting in the queue.");
        System.out.println("-------------------------------------------");
        System.out.println();

        System.out.println("--- Processing Tickets ---");
        for (int i = 0; i < 2; i++) {
Ticket ticket = queue.poll();
            System.out.println("Resolving: " + ticket);
        }
                System.out.println("-------------------------------------------");
        System.out.println();

        System.out.println("All done for now.");
        System.out.println("Remaining tickets in queue: " + queue);

        scanner.close();
    }
            }

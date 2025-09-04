package seriesassignment; 

 

import java.util.InputMismatchException; 

import java.util.Scanner; 

 

public class SeriesAssignment { 

    private static final Scanner sc = new Scanner(System.in); 

 

    public static void main(String[] args) { 

        System.out.println("LATEST SERIES - 2025"); 

        System.out.println("******************************"); 

        System.out.print("Enter (1) to launch menu or any other key to exit: "); 

        String choice = sc.nextLine(); 

 

        if (choice.equals("1")) { 

            runMenu(); 

        } else { 

            System.out.println("Exiting application..."); 

        } 

    } 

        //Application User Interface Menu 

    public static void runMenu() { 

        while (true) { 

            System.out.println("\nPlease select one of the following menu items:"); 

            System.out.println("(1) Capture a new series"); 

            System.out.println("(2) Search for a series"); 

            System.out.println("(3) Update series details"); 

            System.out.println("(4) Delete a series"); 

            System.out.println("(5) Print series report"); 

            System.out.println("(6) Exit Application"); 

            System.out.print("Enter your choice: "); 

 

            int choice; 

            try { 

                choice = sc.nextInt(); 

                sc.nextLine();  

            } catch (InputMismatchException e) { 

                System.out.println("Invalid input! Please enter a number between 1 and 6."); 

                sc.nextLine(); // clear invalid input 

                continue; 

            } 

 

            switch (choice) { 

                case 1 -> SeriesManager.captureSeries(); 

                case 2 -> SeriesManager.searchSeries(); 

                case 3 -> SeriesManager.updateSeries(); 

                case 4 -> SeriesManager.deleteSeries(); 

                case 5 -> SeriesManager.printReport(); 

                case 6 -> { 

                    System.out.println("Exiting application..."); 

                    return; 

                } 

                default -> System.out.println("Invalid choice! Try again."); 

            } 

        } 

    } 

 

     

} 
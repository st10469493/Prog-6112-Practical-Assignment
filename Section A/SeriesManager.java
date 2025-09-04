package seriesassignment; 

 

import java.util.*; 

 

public class SeriesManager { 

    private static final Scanner sc = new Scanner(System.in); 

    private static final List<Series> seriesList = new ArrayList<>(); 

 

    // 1. Capture new series 

    public static void captureSeries() { 

        System.out.print("Enter the series id: "); 

        int id = readInt(); 

 

        // Check if ID already exists 

        for (Series s : seriesList) { 

            if (s.getId() == id) { 

                System.out.println("A series with this ID already exists. Please try again with a unique ID."); 

                return; 

            } 

        } 

 

        System.out.print("Enter the series name: "); 

        String name = sc.nextLine(); 

 

        System.out.print("Enter the series genre: "); //  

        String genre = sc.nextLine(); 

 

        int ageRestriction; 

        while (true) { 

            System.out.print("Enter the age restriction (2-18): "); 

            ageRestriction = readInt(); 

            if (ageRestriction >= 2 && ageRestriction <= 18) break; 

            System.out.println("Invalid age restriction! Must be between 2 and 18."); 

        } 

 

        int episodes; 

        while (true) { 

            System.out.print("Enter the number of episodes: "); 

            episodes = readInt(); 

            if (episodes > 0) break; 

            System.out.println("Number of episodes must be greater than 0!"); 

        } 

 

        seriesList.add(new Series(id, name, genre, ageRestriction, episodes)); //  Updated details for Series 

        System.out.println(" Series details have been successfully saved!"); 

    } 

 

    // 2. Search series by ID 

    public static void searchSeries() { 

        System.out.print("Enter the series id to search: "); 

        int id = readInt(); 

        for (Series s : seriesList) { 

            if (s.getId() == id) { 

                System.out.println(" Series found!\n" + s); 

                return; 

            } 

        } 

        System.out.println(" No series data could be found."); 

    } 

 

    // 3. Update series details 

    public static void updateSeries() { 

        System.out.print("Enter the series id to update: "); 

        int id = readInt(); 

 

        for (Series s : seriesList) { 

            if (s.getId() == id) { 

                System.out.print("Enter the new series name: "); 

                s.setName(sc.nextLine()); 

 

                System.out.print("Enter the new series genre: "); //  New Series Genre 

                s.setGenre(sc.nextLine()); 

 

                int newAge; 

                while (true) { 

                    System.out.print("Enter the new age restriction (2-18): "); 

                    newAge = readInt(); 

                    if (newAge >= 2 && newAge <= 18) { 

                        s.setAgeRestriction(newAge); 

                        break; 

                    } 

                    System.out.println("Invalid age restriction. Try again."); 

                } 

 

                int newEpisodes; 

                while (true) { 

                    System.out.print("Enter the new number of episodes: "); 

                    newEpisodes = readInt(); 

                    if (newEpisodes > 0) { 

                        s.setNumEpisodes(newEpisodes); 

                        break; 

                    } 

                    System.out.println("Number of episodes must be greater than 0!"); 

                } 

 

                System.out.println("Series with ID " + id + " has been updated!"); 

                return; 

            } 

        } 

        System.out.println(" No series found with ID: " + id); 

    } 

 

    // 4. Delete series by ID 

    public static void deleteSeries() { 

        System.out.print("Enter the series id to delete: "); 

        int id = readInt(); 

 

        Iterator<Series> it = seriesList.iterator(); 

        while (it.hasNext()) { 

            Series s = it.next(); 

            if (s.getId() == id) { 

                System.out.print("Are you sure you want to delete series " + id + "? (y/n): "); 

                String confirm = sc.nextLine().trim().toLowerCase(); 

                if (confirm.equals("y")) { 

                    it.remove(); 

                    System.out.println(" Series with ID " + id + " was deleted!"); 

                } else { 

                    System.out.println(" Delete cancelled."); 

                } 

                return; 

            } 

        } 

        System.out.println(" No series found with ID: " + id); 

    } 

 

    // 5. Print all series 

    public static void printReport() { 

        if (seriesList.isEmpty()) { 

            System.out.println("📭 No series available to report."); 

            return; 

        } 

 

        System.out.println("========= SERIES REPORT ========="); 

        int count = 1; 

        for (Series s : seriesList) { 

            System.out.println("Series #" + count++); 

            System.out.println(s); 

            System.out.println("--------------------------------"); 

        } 

    } 

 

    // method to read integers 

    private static int readInt() { 

        while (true) { 

            try { 

                int value = sc.nextInt(); 

                sc.nextLine(); // Discard pending input 

                return value; 

            } catch (InputMismatchException e) { 

                System.out.println("Invalid input! Please enter a number."); 

                sc.nextLine(); // discard bad input 

            } 

        } 

    } 

} 
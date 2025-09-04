package rentacar; 

 

 

import java.util.ArrayList; 

import java.util.Scanner; 

 

class Vehicle { 

    String id, make, model; 

    int year; 

    double dailyRate; 

    boolean isRented; 

 

    public Vehicle(String id, String make, String model, int year, double dailyRate) { 

        this.id = id; 

        this.make = make; 

        this.model = model; 

        this.year = year; 

        this.dailyRate = dailyRate; 

        this.isRented = false; 

    } 

 

    public String toString() { 

        return id + " - " + make + " " + model + " (" + year + ") - R" + dailyRate + "/day - " + 

                (isRented ? "Rented" : "Available"); 

    } 

} 

 

public class RentaCar { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        ArrayList<Vehicle> vehicles = new ArrayList<>(); 

 

        // Example vehicles 

        vehicles.add(new Vehicle("CAR001", "Toyota", "Corolla", 2017, 550)); 

        vehicles.add(new Vehicle("CAR002", "Honda", "Civic", 2011, 400)); 

 

        boolean running = true; 

 

        //Menu for car rental admin 

        while (running) { 

            System.out.println("\n1. Show Vehicles"); 

            System.out.println("2. Rent Vehicle"); 

            System.out.println("3. Return Vehicle"); 

            System.out.println("4. Add Vehicle"); 

            System.out.println("5. Search Vehicle by ID"); 

            System.out.println("0. Exit"); 

            System.out.print("Choose option: "); 

 

            String choice = scanner.nextLine(); 

 

            switch (choice) { 

                case "1": 

                    for (Vehicle v : vehicles) { 

                        System.out.println(v); 

                    } 

                    break; 

 

                case "2": 

                    System.out.print("Enter Vehicle ID to rent: "); 

                    String rentId = scanner.nextLine(); 

                    Vehicle toRent = findVehicle(vehicles, rentId); 

                    if (toRent != null && !toRent.isRented) { 

                        toRent.isRented = true; 

                        System.out.println("Vehicle rented!"); 

                    } else { 

                        System.out.println("Vehicle not found or already rented."); 

                    } 

                    break; 

 

                case "3": 

                    System.out.print("Enter Vehicle ID to return: "); 

                    String returnId = scanner.nextLine(); 

                    Vehicle toReturn = findVehicle(vehicles, returnId); 

                    if (toReturn != null && toReturn.isRented) { 

                        toReturn.isRented = false; 

                        System.out.println("Vehicle returned!"); 

                    } else { 

                        System.out.println("Vehicle not found or not currently rented."); 

                    } 

                    break; 

 

                case "4": 

                    System.out.print("Enter vehicle ID: "); 

                    String id = scanner.nextLine(); 

                    System.out.print("Enter make: "); 

                    String make = scanner.nextLine(); 

                    System.out.print("Enter model: "); 

                    String model = scanner.nextLine(); 

                    System.out.print("Enter year: "); 

                    int year = Integer.parseInt(scanner.nextLine()); 

                    System.out.print("Enter daily rate: "); 

                    double rate = Double.parseDouble(scanner.nextLine()); 

 

                    vehicles.add(new Vehicle(id, make, model, year, rate)); 

                    System.out.println("Vehicle added."); 

                    break; 

 

                case "5": 

                    System.out.print("Enter Vehicle ID to search: "); 

                    String searchId = scanner.nextLine(); 

                    Vehicle found = findVehicle(vehicles, searchId); 

                    if (found != null) { 

                        System.out.println("Found: " + found); 

                    } else { 

                        System.out.println("Vehicle not found."); 

                    } 

                    break; 

 

                case "0": 

                    running = false; 

                    break; 

 

                default: 

                    System.out.println("Invalid option."); 

            } 

        } 

 

        scanner.close(); 

        System.out.println("Goodbye!"); 

    } 

 

    public static Vehicle findVehicle(ArrayList<Vehicle> list, String id) { 

        for (Vehicle v : list) { 

            if (v.id.equalsIgnoreCase(id)) { 

                return v; 

            } 

        } 

        return null; 

    } 

} 
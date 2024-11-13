package org.example;

public class Main {
    public static void main(String[] args) {
        NewDateInterface dateAdapter = new CalendarToNewDateAdapter();

        dateAdapter.setYear(2024);
        dateAdapter.setMonth(11);
        dateAdapter.setDay(13);

        System.out.println("Initial Date: " + dateAdapter);  // Output: 2024-11-13

        dateAdapter.advanceDays(5);
        System.out.println("After advancing 5 days: " + dateAdapter);  // Output: 2024-11-18

        dateAdapter.advanceDays(20);
        System.out.println("After advancing 20 more days: " + dateAdapter);  // Output: 2024-12-08
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MAK
 */
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String menuFile = "menu.txt";
        String[] tokens;
        String Line;
        String menuItem;
        double cost;
        final double tax = 0.10;

        BufferedReader input = null;

        try {
            input = new BufferedReader(new FileReader(menuFile));
        } catch (FileNotFoundException fileNotFound) {
            throw new FileNotFoundException(String.format("File not found", menuFile));
        }

        while ((Line = input.readLine()) != null);
        {
            Line.split(",");
            int lineCount = 0;
            lineCount++;
            
            

        }

            private double calcGrossCost(int) {
                double grossCost;

            }
            
            private double calcNetCost(int ) {
                double netCost;
      
            }
    }
}

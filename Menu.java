
import java.io.*;
import java.util.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MAK
 */
public class Menu {

    private ArrayList<Order> menu;

    public ArrayList<Order> openMenu() throws IOException {
        menu = new ArrayList<>();
        String line;

        File file = new File("Menu.txt");
        BufferedReader bf = new BufferedReader(new FileReader(file));
        while ((line = bf.readLine()) != null) {
            String[] item = line.split(", ");

            String fooditem = item[0];
            float price = Float.valueOf(item[1]);
            menu.add(new Order(fooditem, price));
        }
        return menu;

    }
}

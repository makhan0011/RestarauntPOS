
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

    public getFile() throws IOException {
        File file = new File("Menu.txt");

        BufferedReader bf = new BufferedReader(new FileReader(file));

        String line;
        int i = 0;
        while ((line = bf.readLine()) != null) {

            String[] item = line.split(", ");

            this.fooditem.add(item[0]);
            this.price.add(Float.valueOf(item[1]));
            i += 1;

        }

        for (String str : fooditem) {
            System.out.println(str);
        }
        for (Float f : price) {
            System.out.println(f);
        }

    }

    public String itemFood;
    public double itemPrice;

    public Menu(String itemFood, double itemPrice) {
        this.itemFood = itemFood;
        this.itemPrice = itemPrice;
    }

    public String getFood() {
        return itemFood;
    }

    public double getPrice() {
        return itemPrice;
    }

}

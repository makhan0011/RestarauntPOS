/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author MAK
 */
public class Order extends Menu {

    private String fooditem;
    private float price;

    public Order(String fooditem, double price) {
        this.fooditem = fooditem;
        this.price = (float) price;
    }

    public String getName() {
        return fooditem;
    }

    public double getPrice() {
        return price;
    }
}

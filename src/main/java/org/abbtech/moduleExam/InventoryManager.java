package org.abbtech.moduleExam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    //I/O faylından istifadə edərək inventar elementlərini idarə etmək üçün InventoryManager sinfi yaradın.
    // Fayldan inventar elementlərini oxumaq, yeni inventar elementi əlavə etmək, ID-yə görə inventar elementini axtarmaq,
    // inventar elementlərini yeniləmək və inventar elementlərini silmək üçün
    // InventoryManager sinfində metodları tətbiq edin.
    public static final String FILE_NAME = "file:///Users/sebnem/Downloads/Dosyalar%202%20(1).pdf";

    public List<InventoryItem> readInventoryItems() {
        List<InventoryItem> items = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int itemID = Integer.parseInt(parts[0]);
                String name = parts[1];
                int quantity = Integer.parseInt(parts[2]);
                double price = Double.parseDouble(parts[3]);
                InventoryItem item = new InventoryItem(itemID, name, quantity, price);
                items.add(item);
            }
        } catch (IOException e) {
            System.out.println("İnventar faylını oxumaq xətası: " + e.getMessage());
        }
        return items;
    }

    public void writeInventoryItems(List<InventoryItem> items) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (InventoryItem item : items) {
                bw.write(item.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("İnventar faylının yazılması xətası: " + e.getMessage());
        }
    }
}
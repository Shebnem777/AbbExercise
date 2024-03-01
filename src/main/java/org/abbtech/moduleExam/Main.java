package org.abbtech.moduleExam;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            throw new FileIOException("Fayl daxiletmə/çıxış xətası baş verdi");
        } catch (FileIOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    InventoryManager manager = new InventoryManager();

    List<InventoryItem> items = manager.readInventoryItems();
        System.out.println("Current Inventory:");
        for (InventoryItem item : items) {
        System.out.println(item);
    }

// Yeni element əlavə edir
    InventoryItem newItem = new InventoryItem(100, "New Item", 10, 20000);
        items.add(newItem);
        manager.writeInventoryItems(items);

        // Yenilənmiş inventar göstərir
        System.out.println("\nUpdated Inventory:");
    items = manager.readInventoryItems();
        for (InventoryItem item : items) {
        System.out.println(item);
    }
        MyDTO dto = new MyDTO("This is some data");

        // Serialize the DTO object
        try {
            FileOutputStream fileOut = new FileOutputStream("dto.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(dto);
            out.close();
            fileOut.close();
            System.out.println("DTO object serialized and written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the DTO object (optional)
        try {
            FileInputStream fileIn = new FileInputStream("dto.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            MyDTO dtoFromFile = (MyDTO) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("DTO object deserialized from file. Data: " + dtoFromFile.getData());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

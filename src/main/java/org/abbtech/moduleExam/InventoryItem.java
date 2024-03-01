package org.abbtech.moduleExam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static org.abbtech.moduleExam.InventoryManager.FILE_NAME;


public class InventoryItem {

    //inventar elementini, inventar menecerini və fərdi istisnaları təmsil etmək üçün siniflər yaradın.
    // InventoryItem sinifinin element ID, ad, kəmiyyət və
    // qiymət kimi atributları olmalıdır. Bu atributları təyin etmək və əldə etmək üçün müvafiq konstruktorları
    // və metodları tətbiq edin.

    private int itemID;
    private String name;
    private int quantity;
    private double price;

    public InventoryItem(int itemID, String name, int quantity, double price) {
        this.itemID = itemID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public List<InventoryItem> readInventoryItems() throws FileIOException {
        // Fayldan inventar elementlərini oxumaq üçün üsul
        try 
            (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
             } catch (IOException e) {
               throw new FileIOException("File reading failed: " + e.getMessage());
             }
        throw new FileIOException(" readInventoryItems metodu hələ həyata keçirilməyib");
    }

    public void addItem(InventoryItem item) throws InvalidDataException, FileIOException {
        // İnventarizasiyaya element əlavə etmək üçün bu üsulu tətbiq edin
        if (item == null || item.getName() == null || item.getName().isEmpty() || item.getQuantity() < 0 || item.getPrice() < 0) {
            throw new InvalidDataException("Invalid item data");
    }throw new FileIOException("addItem metodu hələ həyata keçirilməyib");
    }

    public void updateItem(InventoryItem updatedItem) throws FileIOException, InvalidDataException {
    }

}

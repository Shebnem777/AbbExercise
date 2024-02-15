package org.abbtech.lesson4;
public class Product {//TASK1
    public static void main(String[] args) {
        ProductTest();}
    private static String companyName;
    private static int productID;
    private String productName;

    static {
        companyName = "MyCompany";
    }
    {
        productID = 1000;
    }
    public Product(String productName) {  // Konstruktor - Məhsul adını qəbul etmək və təyin etmək
        this.productName = productName;
    }
    public void printProductDetails() { // Məhsulun təfərrüatlarını çap etmək üçün metod
        System.out.println("Şirkətin adı: " + companyName);
        System.out.println("Məhsul ID: " + productID);
        System.out.println("Məhsul adı: " + productName);}
    public static void ProductTest() {
        String userInput = "Məhsul123";
        Product product = new Product(userInput);
        product.printProductDetails();
    }
}


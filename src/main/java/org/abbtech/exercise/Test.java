package org.abbtech.exercise;

public class Test { //TASK1
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
    public Test(String productName) {
        this.productName = productName;
    }
    public void printProductDetails() {
        System.out.println("Şirkətin adı: " + companyName);
        System.out.println("Məhsul ID: " + productID);
        System.out.println("Məhsul adı: " + productName);}
    public static void ProductTest() {
        String userInput = "Məhsul123";
        Test product = new Test(userInput);
        product.printProductDetails();
    }
}

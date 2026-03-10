package com.example;

public class App {

    public static void main(String[] args) {
    	System.out.println(System.getProperty("java.class.path"));

        UserDAO dao = new UserDAO();

        dao.readUsers();

        FileWriterUtil.writeFile("Data successfully processed");

        System.out.println("Application completed");

    }
}

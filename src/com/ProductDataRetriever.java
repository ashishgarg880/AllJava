package com.ProductDataRetriever;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ProductDataRetriever {
    private static final String API_URL = "https://fakestoreapi.com/products";
    private static final String DB_URL = "jdbc://mysql://localhost:3306/products";
    private static final String DB_USER = "user";
    private static final String DB_PASS = "1234";

    private static final Logger logger = Logger.getLogger(ProductDataRetriever.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("error.log");
            logger.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            String productData = fetchDataFromAPI(API_URL);

            if(productData.isEmpty()) {
                logger.warning("Data is empty");
            } else {
                storeDataInDataBase(productData);
            }

        } catch (Exception e) {

        }
    }

    private static String fetchDataFromAPI(String API_URL) {
        StringBuilder responseData = new StringBuilder();
        try {
            URL url = new URL(API_URL);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String line;
            while((line = bufferedReader.readLine()) != null ) {
                responseData.append(line);
            }
            bufferedReader.close();
            httpURLConnection.disconnect();
        } catch (Exception e)  {
            e.printStackTrace();
        }
        return responseData.toString();
    }

    private static void storeDataInDataBase(String productData) throws Exception {
        try(Connection connection = DriverManager.getConnection(DB_URL ,DB_URL, DB_PASS)) {
            String sql = "INSERT INTO PRODUCTS(title, price, )";
            
        }
    }
}

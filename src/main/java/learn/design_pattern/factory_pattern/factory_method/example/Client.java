package learn.design_pattern.factory_pattern.factory_method.example;


import learn.design_pattern.factory_pattern.factory_method.example.factory.FileLoggerFactory;
import learn.design_pattern.factory_pattern.factory_method.example.product.Logger;

public class Client {
    public static void main(String[] args) {
        Logger logger = new FileLoggerFactory().createLogger();
        logger.writeLog();
    }
}

package learn.design_pattern.factory_pattern.factory_method.example.factory;


import learn.design_pattern.factory_pattern.factory_method.example.product.FileLogger;
import learn.design_pattern.factory_pattern.factory_method.example.product.Logger;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        // 创建文件
        // ......
        return logger;
    }
}

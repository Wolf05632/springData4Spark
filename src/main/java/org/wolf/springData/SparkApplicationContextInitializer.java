package org.wolf.springData;

import org.apache.spark.sql.SparkSession;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class SparkApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext context) {
        registerSparkBean(context);
    }

    private void registerSparkBean(ConfigurableApplicationContext context) {
        SparkSession sparkSession = SparkSession.builder()
                .appName("")
                .master("local[*]")
                .getOrCreate();
    }
}

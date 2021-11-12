package org.wolf.springData;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public interface SparkTransformation {
    Dataset<Row> transform(Dataset<Row> dataset);
}

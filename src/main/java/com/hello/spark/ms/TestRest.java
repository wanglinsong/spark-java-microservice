package com.hello.spark.ms;

import spark.Spark;

/**
 *
 */
public class TestRest {
    public static void main(String[] args) {
        Spark.port(5555);
        Spark.staticFiles.externalLocation("/opt/tc");
        Spark.get("/test", (req, res) -> "OK");
    }
}

package com.mycompany.app;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class GetPageCountService
{
    public static void main( String[] args )
    {

        get("/hello", (req, res)->"Hello, world");

        get("/hello/:name", (req,res)->{
            return "Hello, "+ req.params(":name");
        });
    }
}

package uk.co.samples;


public class HelloWorldApp
{

    public static void main( String[] args )
    {
        FileUtils utils = new FileUtils();

       System.out.print("Hello World!" + utils.getValue("name"));
    }
}





public class Input
{
    public static void main(String[] args)
    {
        System.out.print("Enter something:");
        String input = System.console().readLine();
        System.out.println("You wrote: " + input);
    }
}
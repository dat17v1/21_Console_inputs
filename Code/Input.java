


public class Input
{
    public static void main(String[] args)
    {
        System.out.print("Hvad kunne du tænke dig (is eller sodavand)?:");
        String input = System.console().readLine();
        
        if(input.equals("is")) // input == "is"
        {
            System.out.println("You wrote: " + input);
        } else if (input.equals("sodavand")) 
        {
            System.out.println("You wrote: " + input);
        } else {
            System.out.println("Else");
        }
        
    }
}
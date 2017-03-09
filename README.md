# 21 Console Inputs

To day you will learn how to get _Input_ from the Console.    

So far we only printed something out with ```` System.out.println(); ```` , but now you will be able to write something into the console and thus make your program truly dynamic.


````Java    
    System.out.print("Enter something:");
    String input = System.console().readLine();
    System.out.println("You wrote: " + input);
```` 
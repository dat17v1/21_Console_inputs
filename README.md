# 21 Console Inputs

To day you will learn how to get _Input_ from the Console.    

So far we only printed something out with ```` System.out.println(); ```` , but now you will be able to write something into the console and thus make your program truly dynamic.

One way of solving this is by using 

<pre>    
    System.out.print("Enter something:");
    <mark>String input = System.console().readLine();</mark>
    System.out.println("You wrote: " + input);
</pre>     

Other ways of doing the same would be to use a: 
1. BufferedReader class    
or a: 
2. Scanner Class
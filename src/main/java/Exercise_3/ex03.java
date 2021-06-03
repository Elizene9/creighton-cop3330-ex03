package Exercise_3;

import java.util.Scanner;

/*
Quotation marks are often used to denote the start and end of a string.
But sometimes we need to print out the quotation marks themselves by using escape characters.

Create a program that prompts for a quote and an author.
Display the quotation and author as shown in the example output.

Example Output
What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."

Constraints
Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string concatenation instead.
 */
public class ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the quote? ");

        String quote = input.nextLine();

        System.out.print("\nWho said it? ");

        String author = input.nextLine();

        System.out.printf("%s %s \"%s\"", author, "says,", quote);
    }
}

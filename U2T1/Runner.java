package U2T1;

import java.util.Scanner;

public class Runner {

  public static void main(String[] args) {
    // Tell the user to enter a question
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Magic 8 Ball!");
    System.out.print("Enter a yes-no question and I will answer it: ");
    String question = scan.nextLine();

    // Write a little program here to randomly choose
    // one of six responses to the user's yes-no question!

    int rand = (int) (Math.random() * 20);

    // if (rand == 0) {
    //     System.out.println("It is certain");
    // } else if (rand == 1) {
    //     System.out.println("It is decidedly so");
    // } else if (rand == 2) {
    //     System.out.println("Without a doubt");
    // } else if (rand == 3) {
    //     System.out.println("Yes - definitely");
    // } else if (rand == 4) {
    //     System.out.println("You may rely on it");
    // } else if (rand == 5) {
    //     System.out.println("As I see it, yes");
    // } else if (rand == 6) {
    //     System.out.println("Most likely");
    // } else if (rand == 7) {
    //     System.out.println("Outlook good");
    // } else if (rand == 8) {
    //     System.out.println("Yes");
    // } else if (rand == 9) {
    //     System.out.println("Signs point to yes");
    // } else if (rand == 10) {
    //     System.out.println("Reply hazy, try again");
    // } else if (rand == 11) {
    //     System.out.println("Ask again later");
    // } else if (rand == 12) {
    //     System.out.println("Better not tell you now");
    // } else if (rand == 13) {
    //     System.out.println("Cannot predict now");
    // } else if (rand == 14) {
    //     System.out.println("Concentrate and ask again");
    // } else if (rand == 15) {
    //     System.out.println("Don't count on it");
    // } else if (rand == 16) {
    //     System.out.println("My reply is no");
    // } else if (rand == 17) {
    //     System.out.println("My sources say no");
    // } else if (rand == 18) {
    //     System.out.println("Outlook not so good");
    // } else if (rand == 19) {
    //     System.out.println("Very doubtful");
    // }

    if (rand == 0) {
      System.out.println("It is certain");
    }
    if (rand == 1) {
      System.out.println("It is decidedly so");
    }
    if (rand == 2) {
      System.out.println("Without a doubt");
    }
    if (rand == 3) {
      System.out.println("Yes - definitely");
    }
    if (rand == 4) {
      System.out.println("You may rely on it");
    }
    if (rand == 5) {
      System.out.println("As I see it, yes");
    }
    if (rand == 6) {
      System.out.println("Most likely");
    }
    if (rand == 7) {
      System.out.println("Outlook good");
    }
    if (rand == 8) {
      System.out.println("Yes");
    }
    if (rand == 9) {
      System.out.println("Signs point to yes");
    }
    if (rand == 10) {
      System.out.println("Reply hazy, try again");
    }
    if (rand == 11) {
      System.out.println("Ask again later");
    }
    if (rand == 12) {
      System.out.println("Better not tell you now");
    }
    if (rand == 13) {
      System.out.println("Cannot predict now");
    }
    if (rand == 14) {
      System.out.println("Concentrate and ask again");
    }
    if (rand == 15) {
      System.out.println("Don't count on it");
    }
    if (rand == 16) {
      System.out.println("My reply is no");
    }
    if (rand == 17) {
      System.out.println("My sources say no");
    }
    if (rand == 18) {
      System.out.println("Outlook not so good");
    }
    if (rand == 19) {
      System.out.println("Very doubtful");
    }
  }
}

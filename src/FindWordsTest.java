
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FindWordsTest {
    
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
       
        Scanner fileIn = null;
        try{
            fileIn = new Scanner(
                new FileInputStream("src/words.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
            System.exit(0);
        }
        
        System.out.println("Enter a Word:");
        
        String word;
        word = scan.nextLine();
        
        FindWords t = new FindWords();
               
        t.charCount(word);
        
        System.out.println("Words that can be formed from the letters in " + word + ":");
        while(fileIn.hasNext() )
        {
            String s;
            s = fileIn.nextLine();
            if(s.length() <= word.length())
            {
                t.listCount(s);
                t.printWord();
                
            }
        }    
        
    }
     
}


/* OUTPUT

run:
Enter a Word:
swimming
Words that can be formed from the letters in swimming:
gin
gins
i'm
ignis
ins
ism
mig
migs
miming
min
ming
mini
minim
minims
minis
mins
msg
nim
nims
nisi
sign
sin
sing
swig
swim
swimming
swing
wig
wigs
win
wing
wings
wins
wising
BUILD SUCCESSFUL (total time: 3 seconds)


run:
Enter a Word:
hello
Words that can be formed from the letters in hello:
ell
hell
hello
hoe
hole
leo
ole
BUILD SUCCESSFUL (total time: 2 seconds)

*/
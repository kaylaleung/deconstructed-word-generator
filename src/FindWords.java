
public class FindWords {
    
    int[] wordCharCount = new int[26];
    int[] listCharCount = new int[26];
    String tempWord;
    
   public void charCount (String word)
   {
       for(int index = 0; index < word.length(); index++)
       {
           word = word.toLowerCase();
           
           int letter = (int) word.charAt(index) - 97;
           
           wordCharCount[letter]++;
           
       }
       
   }
   
   public void listCount (String list)
   {
       listCharCount = new int[26];
       for(int index = 0; index < list.length(); index++)
       {
           list = list.toLowerCase();
           if(list.charAt(index) != '\'')
           {
            int letter = (int) list.charAt(index) - 97;
            this.listCharCount[letter]++;
           }
           
       }
       tempWord = list;
       
   }
   
   public boolean printWord()
   {
       for(int i = 0; i < wordCharCount.length; i++)
       {
        
           if(listCharCount[i] > wordCharCount[i])
           {
               return false;
           }
       }
       
       System.out.println(tempWord);
       
       return true;
   }
   
}

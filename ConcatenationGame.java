package Java;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*; 

public class ConcatenationGame{ 
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in); 
        int number = input.nextInt(); 
        input.nextLine(); 
        List<String[]> sentList= new ArrayList<>(); 
        for(int i=0;i<number ;i++){ 
            String s = input.nextLine(); 
            String [] words = s.split(" "); 
            sentList.add(words); 
        } 
        int maxlength=0; 
        for(String[]sentence: sentList){ 
            maxlength = Math.max(maxlength,sentence.length); 
        }  
        List<String> concatenatedWordList = new ArrayList<>();  
        for(int i=0;i<maxlength;i++){
            StringBuilder concatenatedWord = new StringBuilder();  
            for(String [] sentence:sentList){ 
                if(i< sentence.length){ 
                    concatenatedWord.append(sentence[i]); 
                } 
            } 
            concatenatedWordList.add(concatenatedWord.toString()); 
        }  
        for(String word: concatenatedWordList){ 
            System.out.println(word); 
        } 
    } 
}
        
        
        
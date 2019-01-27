import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Author Name: Jacob Stephenson
//Date: 26/1/2018
//Program Name: Stepehenson_Spellchecker
//Purpose: Does spell checking on list of words stored in the file

public class Stepehenson_Spellchecker {
    public static void main(String args[]){
        if(args.length != 2){
            System.out.println("Usage: java Stepehenson_Spellchecker <inputFilename> <dictionaryFileName>");
            return;
        }
        try{
            // Read the data in the input test file
            String inputData = new Scanner(new File(args[0])).useDelimiter("\\Z").next();
            
            // Read the data in the dictionary file
            String dictionaryData = new Scanner(new File(args[1])).useDelimiter("\\Z").next();
            
            // Store the words in the list
            ArrayList<String> inputWords=new ArrayList<>(Arrays.asList(inputData.split("\n")));
            ArrayList<String> dictionaryWords=new ArrayList<>(Arrays.asList(dictionaryData.split("\n")));
            
            //loop for each word in the input word list
            for(int i=0;i<inputWords.size();i++){
                String word=inputWords.get(i).trim();
                
                // Check if the word exist in the dictionary
                boolean found=false;
                for(String dictWord:dictionaryWords){
                    if(dictWord.trim().equalsIgnoreCase(word)){
                        found=true;
                    }
                }
                // Print the message if word is not in the dictionary
                if(!found){
                    System.out.println(word +" is an unknown word");
                }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

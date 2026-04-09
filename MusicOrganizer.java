import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class MusicOrganizer
{
    private ArrayList<String> files;
        
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        
    }
    
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    public void listFile(int index) {
        if (validIndex(index)) {
        String filename = files.get(index);
        System.out.println(filename);
        } else {
        System.out.println("Invalid index! Please use a value in the range 0-" + (files.size() - 1));
        }
    }
    
    public void removeFile(int index) {
        if (validIndex(index) == true) {
        files.remove(index);
        System.out.println("File removed successfully.");
        } else {
        System.out.println("Invalid index! Please use a value in the range 0-" + (files.size() - 1));
        }
    }
    
    public void checkIndex(int index)
    {
        if (files.size() == 0){
            System.out.println("YOU HAVE NO FILE, please add some files");
        }
        else if (index >= 0 && index <= files.size()-1){
            System.out.println("VALID");
        }
        else{
            System.out.println("NOT VALID, please use a value in the range 0-" + (files.size()-1));
        }
    }
    
    public boolean validIndex(int index) {
        return index >= 0 && index < files.size();
    }
    
    public void listAllFiles(){
        int position = 0;
        for(String filename : files){
            System.out.println(position + ": " + filename);
            position++;
        }
    }  
    
    public void listingMatching(String searchString){
        boolean found = false;
        for (String filename: files){
            if(filename.contains(searchString)){
                System.out.println(filename);
                found = true;
            }
        }
        if(!found){
                System.out.println("the file is not founded");
        }
    }
    
    public void playARandomTrack()
    {
        if(files.size() == 0){
            System.out.println("There is no files have been founded, please add a files!");
            return;
        }
        Random rand = new Random();
        int index = rand.nextInt(files.size());
        
        String filename = files.get(index);
        System.out.println("Now playing: " + filename);
    }
    
    public void playAllRandomOrder()
    {
        if (files.size() == 0){
            System.out.println("There is no files have been founded, please add a files!");
            return;
        }
        ArrayList<String> shuffledFiles = new ArrayList<>(files);
        Collections.shuffle(shuffledFiles);
        for (String filename : shuffledFiles){
            System.out.println("Now playing: " + filename);
        }
    }
}

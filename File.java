import java.io.*;
public class File {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("output.txt")){
             writer.write("Hello,world !");
        }
        catch(IOException e){
            System.out.println("Error writing to file: "+e.getMessage());
        }
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){
            String line ;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.err.println("Error msg :"+e.getMessage());
        }
    }
}

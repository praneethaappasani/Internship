import java.io.*;
class File
{
	public static void main(String[] args)
	{
        	String filePath = "example.txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))
		{
                	writer.write("Hello!");
                	writer.write("This is a test for writing and reading from a file.");
            		System.out.println("Data written successfully.");
        	} 
		catch (IOException e)
		{
            		System.err.println(e.getMessage());
       		}

        	readFromFile(filePath);
   	}

    	public static void readFromFile(String filePath)
	{
        	try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
		{
            		String line;
            		System.out.println("Reading from the file:");
            		while ((line = reader.readLine()) != null)
			{
                		System.out.println(line);
            		}
        	} 
		catch (IOException e)
		{
            		System.err.println(e.getMessage());
       		}
    	}
}
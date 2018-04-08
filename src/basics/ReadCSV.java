package basics;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV {

	public static void main(String[] args) {
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\aa.csv";
		File file = new File(filename);
		String DataRow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((DataRow = br.readLine()) !=null)
			{
				String[] line = DataRow.split(",");
			    data.add(line);
			  
			
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		for (String[] account : data )
		{
			
			//System.out.println(account);
			System.out.print("[");
			for(String field : account)
				{
				System.out.print(field );
				}
				System.out.println("]");
				

		}
		
		 		//System.out.println("Array Value is :" + );
	}

}

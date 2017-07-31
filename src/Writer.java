import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVWriter;

public class Writer {
	
	public Writer() throws IOException{
		create();
	}
		
	public void create() throws IOException{
		  String csv = "data.csv";
	      CSVWriter writer = new CSVWriter(new FileWriter(csv));
	    
	      //close the writer
	     
	      writer.close();
	}
	
	public void write(String[] list) throws IOException{
		
		  String csv = "data.csv";
	      CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
	        
	    
	      writer.writeNext(list);
	        
	      //close the writer
	      writer.close();
		
	}
	
	public void pars(ArrayList<String> stdControl,ArrayList<String> number,ArrayList<String> control,ArrayList<String> action,
			ArrayList<String> asset,ArrayList<String> org,ArrayList<String> vulnerable,ArrayList<String> security,
			ArrayList<String> severity,ArrayList<String> threat,ArrayList<String> threatSource,ArrayList<String> threatOrigin) throws IOException{

		
		for (int i = 0 ; i < number.size(); i++){
			String [] record = (number.get(i) + "," + stdControl.get(i) + "," + control.get(i) + "," + action.get(i)
			+ "," + asset.get(i) + "," + org.get(i) + "," + vulnerable.get(i) + "," + security.get(i) + "," + severity.get(i) + "," + threat.get(i) + "," + threatSource.get(i) +
					"," + threatOrigin.get(i)).split(",");
			
			write(record);
		}
		
	}
}

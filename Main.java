import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		  String temp;
		  ArrayList<String> city = new ArrayList<String>();
		  Random rand = new Random();
		  int ran = rand.nextInt(10000);
		  File file = new File("C:\\Users\\me023229\\Documents\\cities.txt");
		  String content = null;
		  try {
			  try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8.name())) {
				  content = scanner.useDelimiter("\\A").next();
			  }
		  } 
		  catch (IOException e) {
			  e.printStackTrace();
		  }
		  
		  try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\me023229\\Documents\\cities.txt"))){
			  while(br.ready());{
				  city.add(br.readLine());
			  }
		  } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		  //ADD A SORTER
		  TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
		  int num = 0;
		  	for(int i = 0; i < city.size()-1; i++) {
		  		num = (int)((Math.random() * 90000)+10000);
		  		tree_map.put(num, city.get(i));
		  	}
		  	FileWriter out_put;
		  	try {
		  		out_put = new FileWriter("C:\\Users\\me023229\\Documents\\output.txt");
		  		
		  		BufferedWriter output = new BufferedWriter(out_put);
		  		System.out.println("buffered Writer start Writing");
		  		for(Map.Entry<Integer, String> entry : tree_map.entrySet()) {
		  			output.write(entry.getKey() + " | " + entry.getValue() + "\n");
		  		}
		  		output.close();
		  		System.out.println("Written Successfully");
		  	}
		  	catch (IOException e) {
				e.printStackTrace();
		  	}
		  	
}
}
package final_project;
import java.io.*;
import java.util.*;
public class Test_ReadFile2 {

	private List<Float> price= new ArrayList<Float>();
	private List<String> fooditem=new ArrayList<String>();
	
	public Test_ReadFile2() throws IOException {
         File file= new File("C:\\Users\\jwood\\Desktop\\readfile.txt");
		
		BufferedReader bf= new BufferedReader(new FileReader(file));
		
		String line;
		int i=0;
		while ((line = bf.readLine())!=null ) {
			
			String[] item=line.split(", ");
			
			this.fooditem.add(item[0]);
			this.price.add(Float.valueOf(item[1]));
			i+=1;
			
		}
		
		for (String str: fooditem) {
			System.out.println(str);
		}
		for (Float f: price) {
			System.out.println(f);
		}
		
	}
	public static void main(String[] args) throws IOException {
		
		
		new Test_ReadFile2();
	}
	
}

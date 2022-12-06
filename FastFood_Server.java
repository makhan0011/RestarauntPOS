package final_project;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class FastFood_Server {
	public static void main(String[] args) throws IOException
	 {
		 final int SBAP_PORT = 8888;
		 final double TAX= 0.0884;
	      ServerSocket server = new ServerSocket(SBAP_PORT);
	      
	 
	 
	      while (true)
	      {
	          System.out.println("Waiting for clients to connect...");
	    	  Socket s = server.accept();
	         System.out.println("Client connected.");
	         
	         InputStream input = s.getInputStream();
             BufferedReader br= new BufferedReader(new InputStreamReader(input));
	         
	         PrintWriter writer= new PrintWriter(s.getOutputStream(), true);
	      
	      
	         String data=null;
	         while ((data=br.readLine())!=null) {
	        	 System.out.println("Subtotal: "+data);
	        	 double subtotal_user=Double.parseDouble(data);
	        	 double tax_user=subtotal_user*TAX;
	        	 System.out.println("Tax Total: "+String.format("%.2f", tax_user));
	        	 writer.println(String.format("%.2f", tax_user));
	        	 double total_user=subtotal_user+tax_user;
	        	 System.out.println("Total: "+String.format("%.2f", total_user));
	        	 writer.println(String.format("%.2f", total_user));
	         }

	      
	      s.close();
	      
	      
	      }
	 
	 }
}

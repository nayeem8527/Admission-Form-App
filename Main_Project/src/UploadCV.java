/*
 * Mohammad Nayeem
 * 2014147
 * Mayank Attri
 * 2014063 
 */

import java.io.*;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.output.*;

@WebServlet("/UploadCV")
public class UploadCV extends HttpServlet 
{
	   
	   public String filePath;
	   public File file ;
	   int file_empty=0;
	   String u = "Phd",Year,temp,final_enroll_id;//for getting unique id

	   public void init( )
	   {
	      filePath = "C:/Users/Mohammad/Desktop/workspace1/Main_Project/src/CV"; 
	   }
	   public void doPost(HttpServletRequest request, 
	               HttpServletResponse response)
	              throws ServletException, java.io.IOException 
	   {
	      DiskFileItemFactory factory = new DiskFileItemFactory();
	      ServletFileUpload upload = new ServletFileUpload(factory);
	      try
	      { 
	      List fileItems = upload.parseRequest(request);
	      Iterator i = fileItems.iterator();

	      while ( i.hasNext () ) 
	      {
	         FileItem fi = (FileItem)i.next();
	         if ( !fi.isFormField () )	
	         {
	            String fileName = fi.getName();
	            if( fileName.lastIndexOf("\\") >= 0 )
	            {
	               file = new File( filePath +  
	               fileName.substring( fileName.lastIndexOf("\\"))) ;
	            }
	            else
	            {
	               file = new File( filePath + 
	               fileName.substring(fileName.lastIndexOf("\\")+1)) ;
	            }
	            if(fileName=="")
	            	file_empty++;
	            else
	            {
	            	RandomAccessFile count_id = new RandomAccessFile("C:/Users/Mohammad/Desktop/workspace1/Main_Project/src/counter.txt","rw");
	            	Calendar now = Calendar.getInstance();
					int year = now.get(Calendar.YEAR);
					//unique id//
					int temp1;
					Year = String.valueOf(year);//getting the current year
					temp = count_id.readLine();
					temp1 = Integer.parseInt(temp);
					if(temp1<=9)
						final_enroll_id = u+Year+"00"+temp;
					if(temp1>9)
						final_enroll_id = u+Year+"0"+temp;
					if(temp1>99)
						final_enroll_id = u+Year+temp;
					temp = Integer.toString(temp1);
					count_id.seek(0);
					count_id.write((temp).getBytes());
					count_id.close();
	            	fileName=final_enroll_id+".pdf";
	            	file = new File(filePath, fileName);
		            fi.write( file );
		            String message = "File uploaded successfully";
		            request.setAttribute("message", message);
		            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
	            }
	            
	         }
	      }
	   }
	   catch(Exception ex) 
	   {
	   }
	   if(file_empty==1)
	   {
		   String message = "No File to Upload";
           request.setAttribute("message", message);
           request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		   file_empty=0;
	   }
	 }

	   public void doGet(HttpServletRequest request, 
	                       HttpServletResponse response)
	        throws ServletException, java.io.IOException {
	        
		   RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("File.jsp");
		   RequetsDispatcherObj.forward(request, response);
	   } 
	}
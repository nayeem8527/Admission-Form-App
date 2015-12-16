/*
 * Mohammad Nayeem
 * 2014147
 * Mayank Attri
 * 2014063 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Applicant_first_page")
public class Applicant_first_page extends HttpServlet 
{
	String enroll;
	
	private static final long serialVersionUID = 1L;
    public Applicant_first_page() 
    {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("Applicant_first.jsp");
		RequetsDispatcherObj.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//System.out.println("here filled form can be viewed");
		enroll = request.getParameter("enroll");
		response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
    	BufferedReader br = null;

		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("C:/Users/Mohammad/Desktop/workspace1/Main_Project/src/DOC/"+ enroll +".txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				writer.print(sCurrentLine+"</br>");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
	}
}

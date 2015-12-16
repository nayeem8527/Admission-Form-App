/*
 * Mohammad Nayeem
 * 2014147
 * Mayank Attri
 * 2014063 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@WebServlet("/hello")
public class hello extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		//out.print("<p>hello</p>");
		
		//out.print("<a href=\"https://www.google.com/accounts/Logout?continue=https://appengine.google.com/_ah/logout?continue=http://localhost:8080/final_login/RegisterPage\">Logout</a>");
				
		try 
		{
			String code = request.getParameter("code");
			String urlParameters = "code=" + code
					+ "&client_id=1055932237333-8d95lmbqtv6u5ju3j4pkbijug6dbd446.apps.googleusercontent.com"
					+ "&client_secret=fI0uzk3_oSQXdumrSbpJAxTR"
					+ "&redirect_uri=http://localhost:8080/Main_Project/hello"
					+ "&grant_type=authorization_code";

			// post parameters
			URL url = new URL("https://accounts.google.com/o/oauth2/token");
			URLConnection urlConn = url.openConnection();
			urlConn.setDoOutput(true);
			OutputStreamWriter writer = new OutputStreamWriter(urlConn.getOutputStream());
			writer.write(urlParameters);
			writer.flush();

			// get output in outputString
			String line, outputString = "";
			BufferedReader reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
			while ((line = reader.readLine()) != null) {
				outputString += line;
			}

			// get Access Token
			JsonObject json = (JsonObject) new JsonParser().parse(outputString);
			String access_token = json.get("access_token").getAsString();

			// get User Info
			url = new URL("https://www.googleapis.com/oauth2/v1/userinfo?access_token=" + access_token);
			urlConn = url.openConnection();
			outputString = "";
			reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
			while ((line = reader.readLine()) != null) {
				outputString += line;
			}

			// Convert JSON response into Pojo class
			GooglePojo data = new Gson().fromJson(outputString, GooglePojo.class);
			//System.out.println(data.getEmail());
			
			if(data.getName().equals("Mayank Attri"))
			{
				out.print("<form method='GET' action='Admin'>");
				out.print("<input type='submit'>Admin");
				out.print("</form>");
			}
			else
			{
				String message = data.getName();
				request.setAttribute("message1",message);
				RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("Applicant_first.jsp");
				RequetsDispatcherObj.forward(request, response);
			}
			
			writer.close();
			reader.close();

		} 
		catch (MalformedURLException e) 
		{
			System.out.println(e);
		}
		catch (ProtocolException e) 
		{
			System.out.println(e);
		} catch (IOException e) 
		{
			//for denied access
			RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("login.jsp");
			RequetsDispatcherObj.forward(request, response);
			System.out.println(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
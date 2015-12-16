/*
 * Mohammad Nayeem
 * 2014147
 * Mayank Attri
 * 2014063 
 */
import java.io.*;
import java.nio.channels.FileChannel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.commons.fileupload.FileItem;
//import org.apache.commons.fileupload.FileUploadException;
//import org.apache.commons.fileupload.disk.DiskFileItemFactory;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.sun.jmx.snmp.Timestamp;


@WebServlet("/applicant")
public class applicant extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	String final_email,final_name,final_address_corress,final_mobile,final_phd_stream,final_phd_pref1,final_phd_pref2,
	final_phd_pref3,final_gender,final_category,final_physical_disable,final_dob,final_widow,final_father_name,final_nationality,
	final_per_address,final_pincode;
	String final_tenth_board,final_tenth_marks,final_tenth_year,final_twelth_board,final_twelth_marks,final_twelth_year,
	final_grad_degree,final_grad_department,final_grad_college,final_grad_university,final_grad_city,final_grad_state,final_grad_year,
	final_grad_cgpa_marks,final_grad_cgpa,final_grad_div,final_grad_marks,final_acheivement;
	String final_ece_pref_1,final_ece_pref_2,final_ece_pref_3,final_ece_pref_4,final_pg_college,final_pg_city,final_pg_state,
	final_pg_department,final_pg_degree,final_pg_thesis,final_pg_year,final_pg_cgpa_marks,final_pg_cgpa,final_pg_div,final_pg_marks,
	final_acad_exam,final_acad_subject,final_acad_year,final_acad_score,final_acad_rank,final_gate_area,final_gate_year,final_gate_marks,
	final_gate_score,final_gate_rank;
	String check_ece,check_pg,check_academic,check_gate;
	String EMAIL_REGEX = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
	String MOBILE_REGEX = "^\\+?[0-9. ()-]{10}$";
	String u = "Phd",Year,temp,final_enroll_id;//for getting unique id
	String time_stamp;
		
	int error_email=0,error_mobile=0,error_grad_marks=0,error_pg_marks=0,dob_error=0;
	
	public applicant() 
	{
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("Applicant.jsp");
		RequetsDispatcherObj.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		final_email = request.getParameter("email");
		final_name = request.getParameter("name");
		final_address_corress = request.getParameter("address_corress");
		final_mobile = request.getParameter("mobile");
		final_phd_stream = request.getParameter("phd_stream");
		final_phd_pref1 = request.getParameter("phd_pref1");
		final_phd_pref2 = request.getParameter("phd_pref2");
		final_phd_pref3 = request.getParameter("phd_pref3");
		final_gender = request.getParameter("gender");
		final_category = request.getParameter("category");
		final_physical_disable = request.getParameter("physical_disabled");
		final_dob = request.getParameter("dob");
		final_widow = request.getParameter("widow");
		final_father_name = request.getParameter("father_name");
		final_nationality = request.getParameter("nationality");
		final_per_address = request.getParameter("per_address");
		final_pincode = request.getParameter("pincode");
		final_tenth_board = request.getParameter("tenth_board");
		final_tenth_marks = request.getParameter("tenth_marks");
		final_tenth_year = request.getParameter("tenth_year");
		final_twelth_board = request.getParameter("twelth_board");
		final_twelth_marks = request.getParameter("twelth_marks");
		final_twelth_year = request.getParameter("twelth_year");
		final_grad_degree = request.getParameter("grad_degree");
		final_grad_department = request.getParameter("grad_department");
		final_grad_college = request.getParameter("grad_college");
		final_grad_university = request.getParameter("grad_university");
		final_grad_city = request.getParameter("grad_city");
		final_grad_state = request.getParameter("grad_state");
		final_grad_year = request.getParameter("grad_year");
		final_grad_cgpa_marks = request.getParameter("grad_cgpa_marks");
		final_grad_cgpa = request.getParameter("grad_cgpa");
		final_grad_div = request.getParameter("grad_div");
		final_grad_marks = request.getParameter("grad_marks");
		final_acheivement = request.getParameter("acheivement");
		check_ece = request.getParameter("ece");
		final_ece_pref_1 = request.getParameter("ece_pref1");
		final_ece_pref_2 = request.getParameter("ece_pref2");
		final_ece_pref_3 = request.getParameter("ece_pref3");
		final_ece_pref_4 = request.getParameter("ece_pref4");
		check_pg = request.getParameter("pg");
		final_pg_college = request.getParameter("pg_college");
		final_pg_city = request.getParameter("pg_city");
		final_pg_state = request.getParameter("pg_state");		
		final_pg_department = request.getParameter("pg_department");
		final_pg_degree = request.getParameter("pg_degree");
		final_pg_thesis = request.getParameter("pg_thesis");
		final_pg_year = request.getParameter("pg_year");
		final_pg_cgpa_marks = request.getParameter("pg_cgpa_marks");
		final_pg_cgpa = request.getParameter("pg_cgpa");
		final_pg_div = request.getParameter("pg_div");
		final_pg_marks = request.getParameter("pg_marks");
		check_academic = request.getParameter("academic");
		final_acad_exam = request.getParameter("acad_exam");
		final_acad_subject = request.getParameter("acad_subject");
		final_acad_year = request.getParameter("acad_year");
		final_acad_score = request.getParameter("acad_score");
		final_acad_rank = request.getParameter("acad_rank");
		check_gate = request.getParameter("gate");
		final_gate_area = request.getParameter("gate_area");
		final_gate_year = request.getParameter("gate_year");
		final_gate_marks = request.getParameter("gate_marks");
		final_gate_score = request.getParameter("gate_score");
		final_gate_rank = request.getParameter("gate_rank");
		
		
		if(final_email.compareTo("")!=0)
		{
			error_email = email_check(final_email);
		}
		if(final_mobile.compareTo("")!=0)
		{
			error_mobile = mobile_check(final_mobile);
		}
		if(final_grad_marks.compareTo("")!=0)
		{
			error_grad_marks = marks_check(final_grad_marks);
		}
		if(check_pg!=null && final_pg_marks.compareTo("")!=0)
		{
			error_pg_marks = marks_check(final_pg_marks);
		}
		if(final_dob.compareTo("")!=0)
		{
			dob_error = dob_check(final_dob);
		}
		
		//file writing procedure starts
		if(error_email==1)
		{
			String message = "Wrong email entered";
            request.setAttribute("message2", message);
            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else if(error_mobile==1)
		{
			String message = "Wrong mobile number entered";
            request.setAttribute("message2", message);
            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else if(error_grad_marks==1)
		{
			String message = "Marks cannot be greater than 100.0";
            request.setAttribute("message2", message);
            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else if(error_pg_marks==1)
		{
			String message = "Marks cannot be greater than 100.0";
            request.setAttribute("message2", message);
            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else if(dob_error == 1)
		{
			String message = "Date cannot be in future";
            request.setAttribute("message2", message);
            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else if(final_email == "" || final_name == "" || final_address_corress == "" ||
				   final_mobile == "" || final_phd_stream == "" || final_phd_pref1 == "" ||
				   final_gender == "" || final_category =="" || final_physical_disable == "" ||
				   final_dob =="" || final_widow == "" || final_father_name == "" ||
				   final_nationality == "" || final_per_address =="")
		{
			String message = "Fields marked with * are mandatory(Personal Information)";
            request.setAttribute("message2", message);
            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else if(final_tenth_board == "" || final_tenth_marks == "" || final_tenth_year == "" ||
				final_twelth_board == "" || final_twelth_marks == "" || final_twelth_year == "" ||
				final_grad_degree == "" || final_grad_department == "" || final_grad_college == "" || final_grad_university == "" ||
				final_grad_city == "" || final_grad_state == "" || final_grad_year == "")
		{
			String message = "Fields marked with * are mandatory(Education Information)";
            request.setAttribute("message2", message);
            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else if(final_grad_cgpa_marks.compareTo("cgpa")==0 && (final_grad_cgpa == "" || final_grad_div == ""))
		{
				String message = "Fields marked with * are mandatory(Education Information)";
	            request.setAttribute("message2", message);
	            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else if(final_grad_cgpa_marks.compareTo("marks")==0 && final_grad_marks == "")
		{
				String message = "Fields marked with * are mandatory(Education Information)";
	            request.setAttribute("message2", message);
	            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else if(check_ece != null &&(final_ece_pref_1 == "" || final_ece_pref_2 == "" || final_ece_pref_3 == ""))
		{
				String message = "Fields marked with * are mandatory (Applying for ECE PhD)";
				request.setAttribute("message2", message);
	            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else if(check_pg != null && final_pg_year == "")
		{
				String message = "Fields marked with * are mandatory (Post Graduation)";
				request.setAttribute("message2", message);
	            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else if(check_academic !=null && final_acad_year == "")
		{
				String message = "Fields marked with * are mandatory (Academic Degrees)";
				request.setAttribute("message2", message);
	            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else if(check_gate != null && final_gate_year == "")
		{
				String message = "Fields marked with * are mandatory (Gate)";
				request.setAttribute("message2", message);
	            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
		else
		{
			//changing marks
			if(final_grad_cgpa_marks.compareTo("cgpa")==0)
			{
				double r = Double.parseDouble(final_grad_cgpa);
				r = r*9.5;
				final_grad_marks = String.valueOf(r);
			}
			if(final_pg_cgpa_marks!=null)
			{
				if(final_pg_cgpa_marks.compareTo("cgpa")==0)
				{
					double r = Double.parseDouble(final_pg_cgpa);
					r = r*9.5;
					final_pg_marks = String.valueOf(r);
				}
			}
			//////////
			time_stamp = new SimpleDateFormat("yyyy-mm-dd hh:mm").format(new Date());
			Calendar now = Calendar.getInstance();
			int year = now.get(Calendar.YEAR);
			//unique id//
			int temp1;
			Year = String.valueOf(year);//getting the current year
			RandomAccessFile count_id = new RandomAccessFile("C:/Users/Mohammad/Desktop/workspace1/Main_Project/src/counter.txt","rw");
			RandomAccessFile admin = new RandomAccessFile("C:/Users/Mohammad/Desktop/workspace1/Main_Project/src/admin.txt","rw");
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
			admin.seek(0);
			while(admin.readLine()!=null)
			{
				admin.readLine();
			}
			admin.write((time_stamp+"<<"+final_enroll_id+"<<"+final_email+"<<"+final_name+"<<"+
					 	final_address_corress+"<<"+final_mobile+"<<"+final_phd_stream+"<<"+final_phd_pref1+
					 	"<<"+final_phd_pref2+"<<"+final_phd_pref3+"<<"+final_gender+"<<"+final_category+"<<"+
					 	final_physical_disable+"<<"+final_dob+"<<"+final_widow+"<<"+final_father_name+"<<"+final_nationality+
					 	"<<"+final_per_address+"<<"+final_pincode+"<<"+final_tenth_board+"<<"+final_tenth_marks+"<<"+final_tenth_year+"<<"+
						final_twelth_board+"<<"+final_twelth_marks+"<<"+final_twelth_year+"<<"+
						final_grad_degree+"<<"+final_grad_department+"<<"+final_grad_college+"<<"+final_grad_university+"<<"+
						final_grad_city+"<<"+final_grad_state+"<<"+final_grad_year+"<<"+final_grad_cgpa+"<<"+final_grad_div+"<<"+final_grad_marks+"<<"+final_ece_pref_1+"<<"+final_ece_pref_2+"<<"+final_ece_pref_3+"<<"+final_ece_pref_4+"<<"+final_pg_college+"<<"+
						final_pg_city+"<<"+final_pg_state+"<<"+final_pg_department+"<<"+final_pg_degree+"<<"+
						final_pg_thesis+"<<"+final_pg_year+"<<"+final_pg_cgpa+"<<"+final_pg_div+"<<"+final_pg_marks+"<<"+final_acad_exam+"<<"+final_acad_subject+"<<"+final_acad_year+"<<"+final_acad_score+"<<"+
						final_acad_rank+"<<"+final_gate_area+"<<"+final_gate_year+"<<"+final_gate_marks+"<<"+
						final_gate_score+"<<"+final_gate_rank+"<<"+final_acheivement+"\n").getBytes());
			admin.close();
			@SuppressWarnings("resource")
			PrintWriter p = new PrintWriter("C:/Users/Mohammad/Desktop/workspace1/Main_Project/src/temp.txt");
			p.flush();
			RandomAccessFile link = new RandomAccessFile("C:/Users/Mohammad/Desktop/workspace1/Main_Project/src/temp.txt","rw");
			link.seek(0);
			link.write(("Personal Information" + "\n").getBytes());
			link.write(("Email:- " +" "+ final_email + "\n").getBytes());
			link.write(("Name:- " +" "+ final_name + "\n").getBytes());
			link.write(("Enrollment Number:- " +" "+ final_enroll_id + "\n").getBytes());
			link.write(("Address of Corresspondence:- " +" "+ final_address_corress + "\n").getBytes());
			link.write(("Mobile:- " +" "+ final_mobile + "\n").getBytes());
			link.write(("Phd Stream:- " +" "+ final_phd_stream + "\n").getBytes());
			link.write(("PhD Preference 1:- " +" "+ final_phd_pref1 + "\n").getBytes());
			link.write(("PhD Preference 2:- " +" "+ final_phd_pref2 + "\n").getBytes());
			link.write(("PhD Preference 3:- " +" "+ final_phd_pref3 + "\n").getBytes());
			link.write(("Gender:- " +" "+ final_gender + "\n").getBytes());
			link.write(("Category:- " +" "+ final_category + "\n").getBytes());
			link.write(("Physically Disabled:- " +" "+ final_physical_disable + "\n").getBytes());
			link.write(("Date of Birth:- " +" "+ final_dob + "\n").getBytes());
			link.write(("Children/War Widows of Defence Personnel killed/Disabled in Action:- " +" "+ final_widow + "\n").getBytes());
			link.write(("Father's Name:- " +" "+ final_father_name + "\n").getBytes());
			link.write(("Nationality:- " +" "+ final_nationality + "\n").getBytes());
			link.write(("Permanent Address:- " +" "+ final_per_address + "\n").getBytes());
			link.write(("Pin Code:- " +" "+ final_pincode + "\n").getBytes());
			link.write(("Schooling Information" + "\n").getBytes());
			link.write(("Xth Board:- " +" "+ final_tenth_board + "\n").getBytes());
			link.write(("Xth Marks:- " +" "+ final_tenth_marks + "\n").getBytes());
			link.write(("Year of Passing Xth:- " +" "+ final_tenth_year + "\n").getBytes());
			link.write(("XIIth Board:- " +" "+ final_twelth_board + "\n").getBytes());
			link.write(("XIIth Marks:- " +" "+ final_twelth_marks + "\n").getBytes());
			link.write(("Year of Passing XIIth:- " +" "+ final_twelth_year + "\n").getBytes());
			link.write(("Graduation Information" + "\n").getBytes());
			link.write(("Degree:- " +" "+ final_grad_degree + "\n").getBytes());
			link.write(("Department/Discipline:- " +" "+ final_grad_department + "\n").getBytes());
			link.write(("Name of College:- " +" "+ final_grad_college + "\n").getBytes());
			link.write(("Name of University:- " +" "+ final_grad_university + "\n").getBytes());
			link.write(("City:- " +" "+ final_grad_city + "\n").getBytes());
			link.write(("State:- " +" "+ final_grad_state + "\n").getBytes());
			link.write(("Year of Graduation:- " +" "+ final_grad_year + "\n").getBytes());
			
			if(final_grad_cgpa_marks.compareTo("cgpa")==0)
			{
				link.write(("CGPA:- " +" "+ final_grad_cgpa +" "+ "On the scale of:- "+ " "+ final_grad_div +"\n").getBytes());
			}
			if(final_grad_cgpa_marks.compareTo("marks")==0)
			{
				link.write(("Marks:- " +" "+ final_grad_marks + "\n").getBytes());
			}
			if(check_ece!=null)
			{
				link.write(("ECE PhD Subject Preference" + "\n").getBytes());
				link.write(("Preference 1:- " +" "+ final_ece_pref_1 + "\n").getBytes());
				link.write(("Preference 2:- " +" "+ final_ece_pref_2 + "\n").getBytes());
				link.write(("Preference 3:- " +" "+ final_ece_pref_3 + "\n").getBytes());
				link.write(("Preference 4:- " +" "+ final_ece_pref_4 + "\n").getBytes());
			}
			if(check_pg!=null)
			{
				link.write(("Post - Graduation Information" + "\n").getBytes());
				link.write(("Name of College:- " +" "+ final_pg_college + "\n").getBytes());
				link.write(("City:- " +" "+ final_pg_city + "\n").getBytes());
				link.write(("State:- " +" "+ final_pg_state + "\n").getBytes());
				link.write(("Department/Discipline:- " +" "+ final_pg_department + "\n").getBytes());
				link.write(("Degree:- " +" "+ final_pg_degree + "\n").getBytes());
				link.write(("Thesis/Title:- " +" "+ final_pg_thesis + "\n").getBytes());
				link.write(("Year of Post Graduation:- " +" "+ final_pg_year + "\n").getBytes());
				if(final_pg_cgpa_marks.compareTo("cgpa")==0)
				{
					link.write(("CGPA:- " +" "+ final_pg_cgpa+" "+ "On the scale of" + final_pg_div + "\n").getBytes());
				}
				if(final_pg_cgpa_marks.compareTo("marks")==0)
				{
					link.write(("Marks:- " +" "+ final_pg_marks + "\n").getBytes());
				}
			}
			if(check_academic!=null)
			{
				link.write(("Other Academic Degrees" + "\n").getBytes());
				link.write(("Exam Name:- " +" "+ final_acad_exam + "\n").getBytes());
				link.write(("Subject:- " +" "+ final_acad_subject + "\n").getBytes());
				link.write(("Year:- " +" "+ final_acad_year + "\n").getBytes());
				link.write(("Score:- " +" "+ final_acad_score + "\n").getBytes());
				link.write(("Rank:- " +" "+ final_acad_rank + "\n").getBytes());
			}
			if(check_gate!=null)
			{
				link.write(("Gate" + "\n").getBytes());
				link.write(("Area:- " +" "+ final_gate_area + "\n").getBytes());
				link.write(("Year of Graduation:- " +" "+ final_gate_year + "\n").getBytes());
				link.write(("Marks:- " +" "+ final_gate_marks + "\n").getBytes());
				link.write(("Score:- " +" "+ final_gate_score + "\n").getBytes());
				link.write(("Rank:- " +" "+ final_gate_rank + "\n").getBytes());
			}
			link.write(("Achievements, CV and Statement of Purpose" + "\n").getBytes());
			link.write(("Achievements:- " +" "+ final_acheivement + "\n").getBytes());
			link.close();
			String extra = "C:/Users/Mohammad/Desktop/workspace1/Main_Project/src/DOC/"+final_enroll_id+".txt";
			@SuppressWarnings("resource")
			FileChannel sourceChannel = new FileInputStream("C:/Users/Mohammad/Desktop/workspace1/Main_Project/src/temp.txt").getChannel();
			@SuppressWarnings("resource")
			FileChannel destChannel = new FileOutputStream(extra).getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	        String message = "Form Submitted . Please go to next tab for uploading files.";
			request.setAttribute("message2", message);
            request.getRequestDispatcher("Applicant.jsp").forward(request, response);
		}
	}
	
	public int email_check(String email)
	{
		Boolean b = email.matches(EMAIL_REGEX);
		if(b==false)
		{
			return 1;
		}
		else
			return 0;
	}
	
	public int mobile_check(String mobile)
	{
		Boolean b = mobile.matches(MOBILE_REGEX);
		if(b==false)
		{
			return 1;
		}
		else
			return 0;
	}
	
	public int marks_check(String marks)
	{
		double a = Double.valueOf(marks);
		if(a>100.0)
			return 1;
		else
			return 0;
	}
	
	public int dob_check(String date)
	{
		String[] t = date.split("-");
		int year,month,day;
		year = Integer.valueOf(t[0]);
		month = Integer.valueOf(t[1]);
		day = Integer.valueOf(t[2]);
		if(year>2015)
			return 1;
		else if(month==12 && day>=3)
			return 1;
		else 
			return 0;
	}
	
}



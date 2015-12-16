
/*
 * 
 * @author Mayank Attri 2014063
 * @author Mohammad Nayeem 2014147
 * 
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
 
@WebServlet(name = "Admin", urlPatterns = { "/Admin" })
public class Info extends HttpServlet {
    
	private static final long serialVersionUID = 987654321L;
	BufferedReader br;
	String submit;
	int f=0,f1=0;
	ObservableList<Person> data = FXCollections.observableArrayList();
 
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String en = request.getParameter("option");
    	if(en == null) {
    		showMainPage(request, response);
    	}
    	else {
    		detail(request, response, en);
    	}
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	result(request, response);
    }
 
    private void detail(HttpServletRequest request, HttpServletResponse response, String enroll) throws ServletException, IOException {
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
    
    private void showMainPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        
        BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("C:/Users/Mohammad/Desktop/workspace1/Main_Project/src/Admin.html"));
			while ((sCurrentLine = br.readLine()) != null) {
				writer.print(sCurrentLine);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
    }
    
    private void showTable(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter writer = response.getWriter();
    	
    	String name = request.getParameter("nam");
    	String email = request.getParameter("email");
    	String enroll = request.getParameter("enroll");
    	String cat = request.getParameter("cat");
    	String gen = request.getParameter("gen");
    	String pd = request.getParameter("pd");
    	String dob_option = request.getParameter("dob_option");
    	String dob = request.getParameter("dob");
    	String phds = request.getParameter("phds");
    	String gd = request.getParameter("gd");
    	String pgd = request.getParameter("pgd");
    	String cxb = request.getParameter("cxb");
    	String cxiib = request.getParameter("cxiib");
    	String dg = request.getParameter("dg");
    	String dpg = request.getParameter("dpg");
    	String ug = request.getParameter("ug");
    	String upg = request.getParameter("upg");
    	String sg = request.getParameter("sg");
    	String spg = request.getParameter("spg");
    	String adf = request.getParameter("adf");
    	String adu = request.getParameter("adu");
    	
    	writer.print("Name : "+name+"</br>");
    	writer.print("Email : "+email+"</br>");
    	writer.print("Enroll No. : "+enroll+"</br>");
    	writer.print("Category : "+cat+"</br>");
    	writer.print("Gender : "+gen+"</br>");
    	writer.print("Physically disabled : "+pd+"</br>");
    	writer.print("DOB : "+dob_option+" "+dob+"</br>");
    	writer.print("PhD Stream : "+phds+"</br>");
    	writer.print("Graduation Degree : "+gd+"</br>");
    	writer.print("Post Graduation Degree : "+pgd+"</br>");
    	writer.print("Class X Board : "+cxb+"</br>");
    	writer.print("Class XII Board : "+cxiib+"</br>");
    	writer.print("Department (Graduation) : "+dg+"</br>");
    	writer.print("Department (Post Graduation) : "+dpg+"</br>");
    	writer.print("University (Graduation from) : "+ug+"</br>");
    	writer.print("University (Post Graduation from) : "+upg+"</br>");
    	writer.print("State (Graduation from) : "+sg+"</br>");
    	writer.print("State (Post Graduation from) : "+spg+"</br>");
    	writer.print("Application Dated From : "+adf+"</br>");
    	writer.print("Application Dated Up To : "+adu+"</br>");
    	
    }
    
    private void filter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter writer = response.getWriter();
    	
    	int f_email = 0;
		int f_name = 0;
		int f_en = 0;
		int f_category = 0;
		int f_male = 0;
		int f_female = 0;
		int f_yes = 0;
		int f_no = 0;
		int f_on = 0;
		int f_after = 0;
		int f_before = 0;
		int f_phdstream = 0;
		int f_gd = 0;
		int f_pgd = 0;
		int f_cxb = 0;
		int f_cxiib = 0;
		int f_departG = 0;
		int f_departPG = 0;
		int f_univG = 0;
		int f_univPG = 0;
		int f_stateG = 0;
		int f_statePG = 0;
		int f_adf = 0;
		int f_adu = 0;
		int g1=0,g2=0,g3=0,g4=0,g5=0;
		int e1=0,e2=0,e3=0,e4=0,e5=0;
		int l1=0,l2=0,l3=0,l4=0,l5=0;
		
		if(request.getParameter("email").compareTo("") != 0) 
			f_email = 1;
		if(request.getParameter("nam").compareTo("") != 0) 
			f_name = 1;
		if(request.getParameter("enroll").compareTo("") != 0) 
			f_en = 1;
		if(request.getParameter("cat").compareTo("All") != 0) 
			f_category = 1;
		if(request.getParameter("gen") != null) {
			if(request.getParameter("gen").compareTo("Male") == 0)
				f_male = 1;
			if(request.getParameter("gen").compareTo("Female") == 0) 
				f_female = 1;
		}
		if(request.getParameter("pd") != null) {
			if(request.getParameter("pd").compareTo("Yes") == 0)
				f_yes = 1;
			if(request.getParameter("pd").compareTo("No") == 0) 
				f_no = 1;
		}
		if(request.getParameter("dob").compareTo("") != 0) {
			if(request.getParameter("dob_option").compareTo("On") == 0) 
				f_on = 1;
			if(request.getParameter("dob_option").compareTo("Before") == 0) 
				f_before = 1;
			if(request.getParameter("dob_option").compareTo("After") == 0) 
				f_after = 1;
		}
		if(request.getParameter("phds").compareTo("All") != 0) 
			f_phdstream = 1;
		if(request.getParameter("gd").compareTo("All") != 0) 
			f_gd = 1;
		if(request.getParameter("pgd").compareTo("All") != 0) 
			f_pgd = 1;
		if(request.getParameter("cxb").compareTo("All") != 0)
			f_cxb = 1;
		if(request.getParameter("cxiib").compareTo("All") != 0) 
			f_cxiib = 1;
		if(request.getParameter("dg").compareTo("All") != 0) 
			f_departG = 1;
		if(request.getParameter("dpg").compareTo("All") != 0) 
			f_departPG = 1;
		if(request.getParameter("ug").compareTo("") != 0) 
			f_univG = 1;
		if(request.getParameter("upg").compareTo("") != 0) 
			f_univPG = 1;
		if(request.getParameter("sg").compareTo("All") != 0) 
			f_stateG = 1;
		if(request.getParameter("spg").compareTo("All") != 0) 
			f_statePG = 1;
		if(request.getParameter("adf").compareTo("") != 0) 
			f_adf = 1;
		if(request.getParameter("adu").compareTo("") != 0) 
			f_adu = 1;
		if(request.getParameter("g1") != null)
			g1 = 1;
		if(request.getParameter("g2") != null)
			g2 = 1;
		if(request.getParameter("g3") != null)
			g3 = 1;
		if(request.getParameter("g4") != null)
			g4 = 1;
		if(request.getParameter("g5") != null)
			g5 = 1;
		if(request.getParameter("e1") != null)
			e1 = 1;
		if(request.getParameter("e2") != null)
			e2 = 1;
		if(request.getParameter("e3") != null)
			e3 = 1;
		if(request.getParameter("e4") != null)
			e4 = 1;
		if(request.getParameter("e5") != null)
			e5 = 1;
		if(request.getParameter("l1") != null)
			l1 = 1;
		if(request.getParameter("l2") != null)
			l2 = 1;
		if(request.getParameter("l3") != null)
			l3 = 1;
		if(request.getParameter("l4") != null)
			l4 = 1;
		if(request.getParameter("l5") != null)
			l5 = 1;
		
		try {
			File file = new File("C:/Users/Mohammad/Desktop/workspace1/Main_Project/src/database.txt");
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line  = null;
			while((line=br.readLine())!=null) {
				ArrayList<String> read = new ArrayList<>();
				String[] words = line.split("<<");
				for(int j=0;j<words.length;j++) {
					read.add(words[j]);
				}
				if(read.get(32).compareTo("")!=0) {
					double o;
					int u;
					o=Double.parseDouble(read.get(32));
					o=o*9.5;
					u = (int) Math.floor(o);
					String w = String.valueOf(u);
					read.set(34, w);
				}
				if(read.get(46).compareTo("")!=0){
					double o;
					int u;
					o=Double.parseDouble(read.get(46));
					o=o*9.5;
					u = (int) Math.floor(o);
					String w = String.valueOf(u);
					read.set(48, w);
				}
				
//				System.out.println(read.get(48));
				
				if(f_email==1) {
				    if(read.get(2).equals(request.getParameter("email"))) {}
				    else { continue; }
				}
				if(f_name==1) {
				    if(read.get(3).equals(request.getParameter("nam"))) {}
				    else { continue; }
				}
				if(f_en==1) {
					if(read.get(1).equals(request.getParameter("enroll"))) {}
				    else { continue; }
				}
				if(f_category==1) {
				    if(read.get(11).equals(request.getParameter("cat"))) {}
				    else { continue; }
				}
				if(f_male==1) {
				    if(read.get(10).equals("Male")) {}
				    else { continue; }
				}
				if(f_female==1) {
				    if(read.get(10).equals("Female")) {}
				    else { continue; }
				}
				if(f_yes==1) {	
				    if(read.get(12).equals("Yes")) {}
				    else { continue; }
				}
				if(f_no==1) {
				    if(read.get(12).equals("No")) {}
				    else { continue;}
				}
//				if(f_dob==1) {
//					LocalDate d;
//					d = DP_dob.getValue();
//					try {					
//						if(read.get(13).equals(d.toString())) {}
//				    	else { continue; }
//					}
//					catch(NullPointerException e){}
//				}
				if(f_before == 1) {
					String d = request.getParameter("dob");
					String[] D = d.split("-");
					int y1,m1,d1;
					y1 = Integer.valueOf(D[0]);
					m1 = Integer.valueOf(D[1]);
					d1 = Integer.valueOf(D[2]);
					try {				
						String a = read.get(13);
						String[] arr1 = a.split("-");
						int y2,m2,d2;
						y2 = Integer.valueOf(arr1[2]);
						m2 = Integer.valueOf(arr1[1]);
						d2 = Integer.valueOf(arr1[0]);
						if(y2 <= y1) {
							if(y2 == y1) {
								if(m2 <= m1) {
									if(m2 == m1) {
										if(d2 < d1) {}
										else { continue; }
									}
								}
								else { continue; }
							}
						}
				    	else { continue; }
					}
					catch(NullPointerException e){}
				}
				if(f_on == 1) {
					String d = request.getParameter("dob");
					String[] d1 = d.split("-");
					String d3 = d1[2]+"-"+d1[1]+"-"+d1[0];
					try {					
						if(read.get(13).equals(d3)) {}
				    	else { continue; }
					}
					catch(NullPointerException e){}
				}
				if(f_after == 1) {
					String d = request.getParameter("dob");
					String[] D = d.split("-");
					int y1,m1,d1;
					y1 = Integer.valueOf(D[0]);
					m1 = Integer.valueOf(D[1]);
					d1 = Integer.valueOf(D[2]);
					try {				
						String a = read.get(13);
						String[] arr1 = a.split("-");
						int y2,m2,d2;
						y2 = Integer.valueOf(arr1[2]);
						m2 = Integer.valueOf(arr1[1]);
						d2 = Integer.valueOf(arr1[0]);
						
						if(y2 >= y1) {
							if(y2 == y1) {
								if(m2 >= m1) {
									if(m2 == m1) {
										if(d2 > d1) {}
										else { continue; }
									}
								}
								else { continue; }
							}
						}
				    	else { continue; }
					}
					catch(NullPointerException e){}
				}
				if(f_phdstream==1) {
				    if(read.get(6).equals(request.getParameter("phds"))) {}
				    else { continue; }
				}
				if(f_gd==1) {
				    if(read.get(25).equals(request.getParameter("gd"))) {}
				    else { continue; }
				}
				if(f_pgd==1) {
				    if(read.get(43).equals(request.getParameter("pgd"))) {}
				    else { continue; }
				}
				if(f_cxb==1) {
				    if(read.get(19).equals(request.getParameter("cxb"))) {}
				    else { continue; }
				}
				if(f_cxiib==1) {
				    if(read.get(22).equals(request.getParameter("cxiib"))) {}
				    else { continue; }
				}
				if(f_departG==1) {
				    if(read.get(26).equals(request.getParameter("dg"))) {}
				    else { continue; }
				}
				if(f_departPG==1) {
				    if(read.get(42).equals(request.getParameter("dpg"))) {}
				    else { continue; }
				}
				if(f_univG==1) {
				    if(read.get(28).equals(request.getParameter("ug"))) {}
				    else { continue; }
				}
				if(f_univPG==1) {
				    if(read.get(39).equals(request.getParameter("upg"))) {}
				    else { continue; }
				}
				if(f_stateG==1) {
				    if(read.get(30).equals(request.getParameter("sg"))) {}
				    else { continue; }
				}
				if(f_statePG==1) {
				    if(read.get(41).equals(request.getParameter("spg"))) {}
				    else { continue; }
				}
				if(f_adf == 1) {
					int y,m,date;
					String d = request.getParameter("adf");
					String[] D = d.split("-");
					y = Integer.valueOf(D[0]);
					m = Integer.valueOf(D[1]);
					date = Integer.valueOf(D[2]);
					try {				
						String a = read.get(0);
						String[] array = a.split(" ");
						String[] arr1 = array[0].split("-");
						int Y,M,Date;
						Y = Integer.valueOf(arr1[0]);
						M = Integer.valueOf(arr1[1]);
						Date = Integer.valueOf(arr1[2]);
						if(Y >= y) {
							if(Y == y) {
								if(M >= m) {
									if(M == m) {
										if(Date >= date) {}
										else { continue; }
									}
								}
								else { continue; }
							}
						}
				    	else { continue; }
					}
					catch(NullPointerException e){}
				}
				if(f_adu == 1) {
					int y,m,date;
					String d = request.getParameter("adu");
					String[] D = d.split("-");
					y = Integer.valueOf(D[0]);
					m = Integer.valueOf(D[1]);
					date = Integer.valueOf(D[2]);
					try {				
						String a = read.get(0);
						String[] array = a.split(" ");
						String[] arr1 = array[0].split("-");
						int Y,M,Date;
						Y = Integer.valueOf(arr1[0]);
						M = Integer.valueOf(arr1[1]);
						Date = Integer.valueOf(arr1[2]);
						if(Y <= y) {
							if(Y == y) {
								if(M <= m) {
									if(M == m) {
										if(Date <= date) {}
										else { continue; }
									}
								}
								else { continue; }
							}
						}
				    	else { continue; }
					}
					catch(NullPointerException e){}
				}
				if(g1 == 1) {
					if(request.getParameter("e1") != null) {
						e1 = 0;
						String s = request.getParameter("xp");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(20)) >= m ) {}
						else { continue; }
					}
					else {
						String s = request.getParameter("xp");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(20)) > m ) {}
						else { continue; }
					}
				}
				if(g2 == 1) {
					e2 = 0;
					if(request.getParameter("e2") != null) {
						String s = request.getParameter("xiip");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(23)) >= m ) {}
						else { continue; }
					}
					else {
						String s = request.getParameter("xiip");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(23)) > m ) {}
						else { continue; }
					}
				}
				if(g3 == 1) {
					e3 = 0;
					if(request.getParameter("e3") != null) {
						String s = request.getParameter("gp");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(34)) >= m ) {}
						else { continue; }
					}
					else {
						String s = request.getParameter("gp");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(34)) > m ) {}
						else { continue; }
					}
				}
				if(g4 == 1) {
					e4 = 0;
					if(read.get(48).equals("")) {
						continue;
					}
					else {
						if(request.getParameter("e4") != null) {
							String s = request.getParameter("pgp");
							int m = Integer.valueOf(s);
							if(Integer.valueOf(read.get(48)) >= m ) {}
							else { continue; }
						}
						else {
							String s = request.getParameter("pgp");
							int m = Integer.valueOf(s);
							if(Integer.valueOf(read.get(48)) > m ) {}
							else { continue; }
						}
					}
				}
				if(g5 == 1) {
					e5 = 0;
					if(request.getParameter("e5") != null) {
						String s = request.getParameter("gs");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(56)) >= m ) {}
						else { continue; }
					}
					else {
						String s = request.getParameter("gs");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(56)) > m ) {}
						else { continue; }
					}
				}
				if(l1 == 1) {
					if(request.getParameter("e1") != null) {
						e1 = 0;
						String s = request.getParameter("xp");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(20)) <= m ) {}
						else { continue; }
					}
					else {
						String s = request.getParameter("xp");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(20)) < m ) {}
						else { continue; }
					}
				}
				if(l2 == 1) {
					if(request.getParameter("e2") != null) {
						e2 = 0;
						String s = request.getParameter("xiip");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(23)) <= m ) {}
						else { continue; }
					}
					else {
						String s = request.getParameter("xiip");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(23)) < m ) {}
						else { continue; }
					}
				}
				if(l3 == 1) {
					if(request.getParameter("e3") != null) {
						e3 = 0;
						String s = request.getParameter("gp");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(34)) <= m ) {}
						else { continue; }
					}
					else {
						String s = request.getParameter("gp");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(34)) < m ) {}
						else { continue; }
					}
				}
				if(l4 == 1) {
					e4 = 0;
					if(read.get(48).equals("")) {
						continue;
					}
					else {
						if(request.getParameter("e4") != null) {
							String s = request.getParameter("pgp");
							int m = Integer.valueOf(s);
							if(Integer.valueOf(read.get(48)) <= m ) {}
							else { continue; }
						}
						else {
							String s = request.getParameter("pgp");
							int m = Integer.valueOf(s);
							if(Integer.valueOf(read.get(48)) < m ) {}
							else { continue; }
						}
					}
				}
				if(l5 == 1) {
					if(request.getParameter("e5") != null) {
						e5 = 0;
						String s = request.getParameter("gs");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(56)) <= m ) {}
						else { continue; }
					}
					else {
						String s = request.getParameter("gs");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(56)) < m ) {}
						else { continue; }
					}
				}
				if(e1 == 1) {
					String s = request.getParameter("xp");
					int m = Integer.valueOf(s);
					if(Integer.valueOf(read.get(20)) == m ) {}
					else { continue; }
				}
				if(e2 == 1) {
					String s = request.getParameter("xiip");
					int m = Integer.valueOf(s);
					if(Integer.valueOf(read.get(23)) == m ) {}
					else { continue; }
				}
				if(e3 == 1) {
					String s = request.getParameter("gp");
					int m = Integer.valueOf(s);
					if(Integer.valueOf(read.get(34)) == m ) {}
					else { continue; }
				}
				if(e4 == 1) {
					if(read.get(48).equals("")) {
						continue;
					}
					else {
						String s = request.getParameter("pgp");
						int m = Integer.valueOf(s);
						if(Integer.valueOf(read.get(48)) == m ) {}
						else { continue; }
					}
				}
				if(e5 == 1) {
					String s = request.getParameter("gs");
					int m = Integer.valueOf(s);
					if(Integer.valueOf(read.get(56)) == m ) {}
					else { continue; }
				}
				data.add(new Person(read.get(1),read.get(3)));
//				String temp = read.get(1);
//				writer.append("<FORM METHOD=\"POST\">");
//				writer.print(read.get(3));
//				writer.print("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
//				writer.print(read.get(1));
//				writer.print("&nbsp");
//				writer.println("<a href='?option="+temp+"'><button type='button' style='margin-left:100px'>Open</button></a>");
//				writer.append("</FORM>");
			}

			
			
			writer.print("<!DOCTYPE html>" +
                    "<html>" +
                    "<head>" 
                    +"<link rel='stylesheet' href='E:/Workspace1/AP Project/src/bootstrap.css'>" +
                    "<link rel=\"stylesheet\" href=\"E:/Workspace1/AP Project/src/main.css\">" 
                    +"<link rel=\"stylesheet\" href=\"E:/Workspace1/AP Project/src/form.css\">"
                   

                    +"<title>PhD Admissions IIITD</title>" +
                    "</head>" +
                    
                    "<body>" +
                    	"<div class=\"nav\">"
                    		+"<div class=\"container\" id=\"custom-link\">"          
                    			+"<ul class=\"pull-center\">"
                    			+"<h7 style=\"color: white\">abc</h7>"
                    			+"<h3 style=\"color: black\">Filtered Entries</h3>"
                    			+"</ul>"
                    		+"</div>"
                    	+"</div>"+
                    "<div class=\"nav\">" +
            "<div class=\"container\">" +
            
            "</div>" +
            "</div>" +
            "<div class=\"mytable\">" +
                    "<table class=\"table\">" +
                    "<thead>" +
                    "<tr id=\"coltitle\">" +
                    "<th>Name</th>" +
                    "<th>Enrollment Number</th>" +
                    "<th>Link to Details</th>" +
                    "</tr>" +
                    "</thead>");

             for(Person d : data) {
                 writer.print("<tr>" +"<td>" + d.getName() + "</td>" +"<td>" + d.getEID() + "</td>" +"<td>"+ /*"<form action=\"#\">" +"<input type=\"hidden\" name=\"ID\" value=\"" + d.getEID() + "\">" +"<input type=\"submit\" value=\"Update\">"*/ "<FORM METHOD=\"POST\">"+"<a href='?option="+d.getEID()+"'><button type='button' style='margin-left:100px'>Open</button></a>" +"</FORM>" +"</td>" +"</tr>");
             }
             writer.print(
                        "</table>" +
                        "</div>" +
                        "</body>" +
                        "</html>");
			
			
			
		}
		catch(FileNotFoundException e){}
		catch(IOException e){}
		finally { if(br!=null) { try { br.close();} catch(IOException e){}}}
    }
    
    private void result(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int flag = 0;
    	
    	if(request.getParameter("dob_option") != null && request.getParameter("dob").equals("")) {
    		System.out.println("Date not Selected");
    		flag++;
    	}
    	if(request.getParameter("g1") != null || request.getParameter("e1") != null || request.getParameter("l1") != null) {
    		if(request.getParameter("xp").equals("")) {
    			System.out.println("Percentage not Entered");
    			flag++;
    		}
    	}
    	if(request.getParameter("g2") != null || request.getParameter("e2") != null || request.getParameter("l2") != null) {
    		if(request.getParameter("xiip").equals("")) {
    			System.out.println("Percentage not Entered");
    			flag++;
    		}
    	}
    	if(request.getParameter("g3") != null || request.getParameter("e3") != null || request.getParameter("l3") != null) {
    		if(request.getParameter("gp").equals("")) {
    			System.out.println("Percentage not Entered");
    			flag++;
    		}
    	}
    	if(request.getParameter("g4") != null || request.getParameter("e4") != null || request.getParameter("l4") != null) {
    		if(request.getParameter("pgp").equals("")) {
    			System.out.println("Percentage not Entered");
    			flag++;
    		}
    	}
    	if(request.getParameter("g5") != null || request.getParameter("e5") != null || request.getParameter("l5") != null) {
    		if(request.getParameter("gs").equals("")) {
    			System.out.println("Percentage not Entered");
    			flag++;
    		}
    	}
    	
    	if(flag == 0) {
    		filter(request, response);
    	}
    	else {
    		System.out.println("Error");
    		showMainPage(request, response);
    	}
    }
}
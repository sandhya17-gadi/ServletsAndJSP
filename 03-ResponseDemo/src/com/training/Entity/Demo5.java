package com.training.Entity;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo5
 */
@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Set<Player> players=new HashSet<Player>();
		Player p1=new Player(1, "Dhoni", 50, 1234, 15, true);
		Player p2=new Player(2, "Kohil", 40, 1104, 17, false);
		Player p3=new Player(3, "Rhaina", 50, 900, 10, false);
		Player p4=new Player(4, "Sachin", 20, 700, 12, false);
		Player p5=new Player(5, "Gambir", 30, 1500, 18, false);
		Player p6=new Player(6, "Gangooly", 70, 1400, 20, false);
		Player p7=new Player(7, "Harbajan", 90, 1890, 13, false);
		Player p8=new Player(8, "Sehwag", 50, 1345, 22, false);
		Player p9=new Player(9, "Dravid", 60, 1987, 24, false);
		Player p10=new Player(10, "Dawan", 55, 19784, 8, false);
		Player p11=new Player(11, "Zaadav", 85, 1777, 11, false);
		
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);
		players.add(p6);
		players.add(p7);
		players.add(p8);
		players.add(p9);
		players.add(p10);
		players.add(p11);
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		
		out.println("<link href='Style.css' rel='Stylesheet'>");
		out.println("</head>");
		out.println("<body>");
		out.println("</body>");
		out.println("</html>");
		
		out.print("<table border='1'>");
		
		out.print("<tr>");
		out.print("<th>"+"Player Id"+"</th>");
		out.print("<th>"+"Player Name"+"</th>");
		out.print("<th>"+"No of Matches"+"</th>");
		out.print("<th>"+"Runs Scored"+"</th>");
		out.print("<th>"+"No of Wickets"+"</th>");
		out.print("<th>"+"Captain"+"</th>");
		out.print("<th>"+"Average Bating Rating"+"</th>");
		out.print("<th>"+"Average Bowling Rating"+"</th>");
		
		out.println("</tr>");
		
		for (Player playersDetails : players) {
			
			out.print("<tr>");
			out.print("<td>"+playersDetails.getPlayerId()+"</td>");
			out.print("<td>"+playersDetails.getPlayerName()+"</td>");
			out.print("<td>"+playersDetails.getNoOfMatches()+"</td>");
			out.print("<td>"+playersDetails.getTotalRunScore()+"</td>");
			out.print("<td>"+playersDetails.getNoOfWickets()+"</td>");
			out.print("<td>"+playersDetails.isCaptain()+"</td>");
			out.print("<td>"+playersDetails.getBatingRating()+"</td>");
			out.print("<td>"+playersDetails.getBowlingRating()+"</td>");
						
			
			out.println("</tr>");
			
		}
		
		
		out.println("</table");
		
	}

}

package cn.edu.scau.cmi.chenjieling.client;
import cn.edu.scau.cmi.chenjieling.interProgramming.*;

public class InterProgrammingClient {

	public static void main(String[] args) {
		Student graduateStudent=new GraduateStudent();
		graduateStudent.learning();
		
		Student undergraduateStudent=new UndergraduateStudent();
		undergraduateStudent.learning();
		
		

	}

}

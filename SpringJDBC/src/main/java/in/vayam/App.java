package in.vayam;



import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.management.relation.Role;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.vayam.beans.Student;
import in.vayam.mappers.StudentRowMapper;
import in.vayam.resource.SpringConfig;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	

         ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       JdbcTemplate jd= context.getBean(JdbcTemplate.class);
    
       /*
       int roll_no=101;
       String na="Akhalesh";
       String ci="khargone";
       String q="insert into Student values=?,?,?";
     int c=jd.update(q,roll_no,na,ci);
        if (c>0)
        {
        	System.out.println( " Recorder insert successfully");        	
		}
        else {
        	System.out.println( " Somthing well rong ");
		}
		*
       String ci="khandwa";
       int rollno=1011;
       String Up_sql="update Student SET city=? where rollno";
       
       int c = jd.update(Up_sql, ci);
       if (c>0)
       {
		System.out.println("Recorded update SuccessFully");
	}
       else 
       {
		System.out.println("Recorded is not SuccessFully");
	}
	*
       
       int rollno=1011;
       String del_sql="delete from student where rollno";
       int c = jd.update(del_sql,rollno);
       if (c>0)
       {
		System.out.println("Recorded update SuccessFully");
	}
       else 
       {
		System.out.println("Recorded is not SuccessFully");
	} 
	*/
       
       //-------------Select Operation
       
       String sel_sql="select * from Student";
       List <Student> set_list= jd.query(sel_sql, new StudentRowMapper());
       
       for(Student stud :set_list)
       {
    	   System.out.println("rollno :: "+stud.getRollno());
    	   System.out.println("name :: "+stud.getName());
    	   System.out.println("City :: "+stud.getCity());
    	   System.out.println("------------------------");
       }
       
       
    }
}

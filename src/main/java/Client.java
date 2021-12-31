import com.javaConfig.config.JavaConfig;
import com.javaConfig.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
     public static  void main(String args[])
     {
          ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
          Student student = context.getBean(Student.class);
          System.out.println(student.getName());

     }
}

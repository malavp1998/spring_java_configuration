import com.javaConfig.config.JavaConfig;
import com.javaConfig.model.Student;
import com.javaConfig.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
     public static  void main(String args[])
     {
          ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
          Student student = context.getBean(Student.class);
          User user = context.getBean(User.class);
          System.out.println(student.getName());
          System.out.println(user.getName());
          


     }
}

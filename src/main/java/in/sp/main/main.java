package in.sp.main;

import in.sp.beans.Student;
import in.sp.config.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std = context.getBean(Student.class);
        std.display();

    }
}

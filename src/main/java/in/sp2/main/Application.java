package in.sp2.main;

import in.sp2.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        NamedParameterJdbcTemplate npJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
        Map<String,Object> map = new HashMap<>();
        map.put("id",105);
        map.put("name","Vrushali");
        map.put("marks",67.8);
        String insertSQLQUERY = "INSERT INTO student VALUES(:id,:name,:marks)";
        int count = npJdbcTemplate.update(insertSQLQUERY,map);
        System.out.println("Insertion success for"+count);

    }
}

import com.itheima.Utils.MyBatisUtils;
import com.itheima.mapper.StudentMapper;
import com.itheima.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nie
 * @create 2022-05-16-21:09
 */
public class StudentTest {
    @Test
    public void findstudnetBynameAndmojor(){
        SqlSession sessionUtils = MyBatisUtils.getSessionUtils();
        StudentMapper mapper = sessionUtils.getMapper(StudentMapper.class);
        Student student = new Student();
//        student.setName("张三");
//        student.setMajor("英语");
        List<Student> students = mapper.findstudnetBynameAndmojor(student);
        for (Student stu:
            students) {
            System.out.println(stu);
        }
    }
    @Test
    public void findall(){
        SqlSession sessionUtils = MyBatisUtils.getSessionUtils();
        StudentMapper mapper = sessionUtils.getMapper(StudentMapper.class);
        ArrayList<Integer> ids = new ArrayList<>();
        for(int i=0;i<5;i++){
            ids.add(i);
        }
        List<Student> findall = mapper.findall(ids);
        for(Student stu: findall){
            System.out.println(stu);
        }
    }
}

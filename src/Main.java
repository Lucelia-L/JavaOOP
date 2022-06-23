import model.Student;

/**
 * @author Lucelia
 * @date 2022/6/23 19:55
 */
public class Main {

    public static void main(String[] args) {
        Student student = new Student("ZhangSan",18,"male","0001");
        System.out.println(student.getStuName()+ ' '+student.getAge() + ' '
         + student.getGender()+' '+ student.getIdNO());
    }
}

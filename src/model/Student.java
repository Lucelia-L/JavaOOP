package model;

/**
 * @author Lucelia
 * @date 2022/6/23 19:53
 */
public class Student {

    private String stuName;

    private Integer age;

    private String gender;

    private String IdNO;

    public Student(){}

    public Student(String stuName, Integer age, String gender, String idNO) {
        this.stuName = stuName;
        this.age = age;
        this.gender = gender;
        IdNO = idNO;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNO() {
        return IdNO;
    }

    public void setIdNO(String idNO) {
        IdNO = idNO;
    }
}

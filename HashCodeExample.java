class Student{
    int rollNo;
    String name;

public Student(int rollNo,String name)
{
    this.rollNo = rollNo;
    this.name = name;

}
public int hashCode(){
    return rollNo;//return hexaDEcimal value
}
}
public class HashCodeExample{
    public static void main(String[] args)
    {
        Student s1 = new Student(101,"Ram");
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(Integer.toHexString(s1.hashCode()));

    }
}

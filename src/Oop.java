public class Oop {
    public static void main(String[] args){
        Student s = new Student(1,"parkar",new int[]{80,90,87});
        Student s1 = new Student(2,"peter",new int[]{86,91,88});
        float savg = s.avg();
        float s1avg = s1.avg();
        System.out.println(savg + " " + s1avg);
    }
}

class Student{
    int rollno ;
    String name;
    int[] marks;

    Student (int rollno,String name,int[] marks){
      this.rollno = rollno;
      this.name = name;
      this.marks = marks;
    }
    float avg(){
        float avg = 0;
        int sum = 0 ;
        for (int mark : this.marks) {
            sum = sum + mark;
        }
        avg = (float) sum / this.marks.length;
        return avg;
    }
}

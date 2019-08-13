
public class CallStudent {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student wanwipa = new Student();
        System.out.println("object wanwipa ="+wanwipa);
        wanwipa.addCourse();
        wanwipa.dropCourse();
        wanwipa.payment();
        wanwipa.enrollment();
        
       //crete object GraduateStudent
       GraduateStudent wanwi = new GraduateStudent();
        System.out.println("object wanwi ="+wanwi);
       wanwi.oralExamination();
       wanwi.thesisExaminitaon();
       wanwi.enrollment();
       wanwi.addCourse();
       wanwi.dropCourse();
       wanwi.payment();
    }
}

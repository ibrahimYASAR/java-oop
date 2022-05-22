public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","TRH","90500000000");
        Teacher t2= new Teacher("Graham Bell","FZK","0000");
        Teacher t3= new Teacher("Kulyutmaz","BIO","1111");
        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik= new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo=new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1=new Student("Inek Saban","123","4",tarih,fizik,biyo);
        s1.addBulExamNote(100,78,50);
        s1.isPass();

        Student s2=new Student("Guduk Necmi","444","4",tarih,fizik,biyo);
        s2.addBulExamNote(50,30,70);
        s2.isPass();

    }
}

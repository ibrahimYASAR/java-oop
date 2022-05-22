public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classses;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo,String classses, Course c1,Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classses=classses;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }


    void addBulExamNote(int note1, int note2, int note3){
        if(note1>=0 && note1<=100){
            this.c1.note=note1;
        }
        if(note2>=0 && note2<=100){
            this.c2.note=note2;
        }
        if(note3>=0 && note3<=100){
            this.c3.note=note3;
        }


    }

    void isPass(){
        System.out.println("---------------------------------------\n");
        this.avarage=(this.c1.note + this.c2.note + this.c3.note)/3.0;
        if(this.avarage>=55){
            System.out.println("Hababam Sinifi Uyaniyor...");
            this.isPass=true;
        }else {
            System.out.println("Hababam Sinifi Sinifta Kaldi...");
            this.isPass=false;
        }
        prinNote();
    }

    void prinNote(){

        System.out.println(this.c1.name+" Notu:"+this.c1.note);
        System.out.println(this.c2.name+" Notu:"+this.c2.note);
        System.out.println(this.c3.name+" Notu:"+this.c3.note);
        System.out.println("Ortalamaniz : "+this.avarage);

    }

}

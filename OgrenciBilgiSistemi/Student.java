public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    public Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
        calcAvarage();
    }

    public void calcAvarage() {
        double mat_Ave = this.mat.note*0.8 + this.mat.verbalNote*0.2;
        double fizik_Ave = this.fizik.note*0.8 + this.fizik.verbalNote*0.2;
        double kimya_Ave = this.kimya.note*0.8 + this.kimya.verbalNote*0.2;
        double _avarage = (fizik_Ave + mat_Ave + kimya_Ave)/3;
        this.avarage = Math.round(_avarage*100)/100d;
    }
    public void addBulkExamNote(int mat, int fizik, int kimya){
        if(mat>=0 && mat<=100){
            this.mat.note =mat;
        }
        if(fizik>=0 && fizik<=100){
            this.fizik.note =fizik;
        }
        if(kimya>=0 && kimya<=100){
            this.kimya.note =kimya;
        }
    }

    public void addBulkVerbalNote(int verb_mat, int verb_fizik, int verb_kimya){
        if(verb_mat>=0 && verb_mat<=100){
            this.mat.verbalNote =verb_mat;
        }
        if(verb_fizik>=0 && verb_fizik<=100){
            this.fizik.verbalNote =verb_fizik;
        }
        if(verb_kimya>=0 && verb_kimya<=100){
            this.kimya.verbalNote =verb_kimya;
        }
    }
    public void isPass(){
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0){
            System.out.println("Notlar tam olarak girilmemiş.");
        }else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama:" + this.avarage);
            if(this.isPass){
                System.out.println("--> Sınıfı Geçti.");
            }else{
                System.out.println("--> Sınıfta kaldı.");
            }
        }
    }
    public void printNote(){
        System.out.println("-----------------------");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik Sınav Notu: " + this.mat.note + ", Sözlü Notu : " +this.mat.verbalNote);
        System.out.println("Fizik Sınav Notu: " + this.fizik.note + ", Sözlü Notu : " + this.fizik.verbalNote);
        System.out.println("Kimya Sınav Notu: " + this.kimya.note + ", Sözlü Notu :" + this.kimya.verbalNote);
    }
    public boolean isCheckPass(){
        calcAvarage();
        return this.avarage > 55;
    }

        }

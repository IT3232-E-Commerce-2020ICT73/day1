class Student {
    String name;
    int mark;

    Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }


    public static void main(String args[]){
        Student st1 = new Student("Neranjana", 54);
        Student st2 = new Student("Chamodi", 76);
        Student st3 = new Student("Thilan", 81);
        Student st4 = new Student("Rivindu", 65);
        Student st5 = new Student("Tharushi", 56);

        Student[] students = new Student[5];

        students[0] = st1;
        students[1] = st2;
        students[2] = st3;
        students[3] = st4;
        students[4] = st5;

        double total = 0;

        for(int i = 0; i < students.length; i++){
            total += students[i].mark;
        }

        System.out.println("Average : " + total / students.length);
    }
}
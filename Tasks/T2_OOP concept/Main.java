class Main {
    public static void main(String[] args) {
        
        Student[] s = new Student[5];

        for (int i = 0; i < 5; i++) {
            s[i] = new Student();
            s[i].setName("Student-" + i);
            s[i].setId(201 + i);
            s[i].setCg(2.5 + (i * 0.1));
            s[i].setDpt("CSE");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(s[i].getName() + " " + s[i].getId() + " " + s[i].getCg() + " " + s[i].getDpt());
        }
        
    }
}

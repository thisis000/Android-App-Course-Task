class Main {
    public static double tmpCG = 2.5;
    
    public static void main(String[] args) {

        int x = 10;
        University[] uni = new University[x];

        for (int i = 0; i < x; i++) {
            uni[i] = new University();
            uni[i].setUni(getRandomUni(i));
            uni[i].setName("Name-" + (i + 1));
            uni[i].setId(456 + i);
            uni[i].setDpt(getRandomDpt(i));
            uni[i].setCg(getGenCG(i));
        }

        for (int i = 0; i < x; i++) {
            System.out.println(uni[i].getUni() + " " + uni[i].getName() + " " + uni[i].getId() + " " + uni[i].getDpt() + " " + uni[i].getCg());
        }
    }
    
    public static String getRandomUni(int i) {
        if (i % 3 == 0) return "DIU";
        else if (i % 4 == 0) return "CUET";
        else return "AIUB";
    }

    public static String getRandomDpt(int i) {
        if (i % 2 == 0) return "CSE";
        else if (i % 5 == 0) return "EEE";
        else return "BBA";
    }

    public static double getGenCG(int i) {
        tmpCG += (i * 0.5);
        if (tmpCG < 4) {
            return tmpCG;
        } else {
            tmpCG = 2.5;
            return 4.0;
        }
    }
}

class Student extends Department {

    String name;
    int id;
    double cg;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCg(double cg) {
        this.cg = cg;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCg() {
        return cg;
    }
}

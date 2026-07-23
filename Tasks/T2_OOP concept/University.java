class University extends Department {

    private String university;

    public void setUni(String university) {
        this.university = university;
    }

    public String getUni() {
        return university;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setCg(double cg) {
        super.setCg(cg);
    }

    @Override
    public void setDpt(String department) {
        super.setDpt(department);
    }
}

class Department extends Student {
    private String department;

    public void setDpt(String department) {
        this.department = department;
    }

    public String getDpt() {
        return department;
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
}

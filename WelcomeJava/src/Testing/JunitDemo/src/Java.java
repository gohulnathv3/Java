public class Java {
    String name;
    String ideName;
    String yearsofExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdeName() {
        return ideName;
    }

    public void setIdeName(String ideName) {
        this.ideName = ideName;
    }

    public String getYearsofExperience() {
        return yearsofExperience;
    }

    public void setYearsofExperience(String yearsofExperience) {
        this.yearsofExperience = yearsofExperience;
    }

    public Java(String name, String ideName, String yearsofExperience) {
        this.name = name;
        this.ideName = ideName;
        this.yearsofExperience = yearsofExperience;
    }

    public Java() {
    }
}

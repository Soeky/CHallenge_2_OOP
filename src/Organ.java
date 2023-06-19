public class Organ {
    private String name;
    private String medicalCon;

    public Organ(String name, String medicalCon) {
        this.name = name;
        this.medicalCon = medicalCon;
    }

    public void getDetails(){
        System.out.println("Name: " +this.getName());
        System.out.println("Medical Condition: "+this.getMedicalCon());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCon() {
        return medicalCon;
    }

    public void setMedicalCon(String medicalCon) {
        this.medicalCon = medicalCon;
    }
}

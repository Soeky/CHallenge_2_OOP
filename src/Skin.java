public class Skin extends Organ{
    private String colour;
    private int softness;

    public Skin(String name, String medicalCon, String colour, int softness) {
        super(name, medicalCon);
        this.colour = colour;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Colour of skin: "+ this.getColour());
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}

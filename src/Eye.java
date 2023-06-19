public class Eye extends Organ{
    private String colour;
    private boolean isOpen;


    public Eye(String name, String medicalCon, String colour, boolean isOpen) {
        super(name, medicalCon);
        this.colour = colour;
        this.isOpen = isOpen;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Colour: "+this.getColour());
    }

    public String getColour() {
        return colour;
    }

    public void open() {
        this.setOpen(true);
        System.out.println(this.getName()+" is opened");
    }
    public void close() {
        this.setOpen(false);
        System.out.println(this.getName()+" is closed");
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}

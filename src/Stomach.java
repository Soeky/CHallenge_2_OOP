public class Stomach extends Organ{
    private boolean empty;

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
    public void digest(){
        System.out.println("Digesting...");
    }

    public Stomach(String name, String medicalCon, boolean empty) {
        super(name, medicalCon);
        this.empty = empty;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        if (this.isEmpty()){
            System.out.println("needs to be fed");
        }else System.out.println("Stomach is full");
    }
}

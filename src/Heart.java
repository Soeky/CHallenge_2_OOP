public class Heart extends Organ{
    private int rate;

    public Heart(String name, String medicalCon, int rate) {
        super(name, medicalCon);
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart Rate: "+ this.getRate());
    }
}

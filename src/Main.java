import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("brad", 28,
                new Eye("Left Eye", "Kurz sichtig","braun", false),
                new Eye("Right Eye", "in ordnung","braun", false),
                new Heart("heart","normal",60),
                new Stomach("stomach", "normal", true),
                new Skin("skin","verbrannt","hell",20));
        System.out.println("Name: "+ patient.getName());
        System.out.println("Alter: "+ patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean finish = false;
        while(!finish){
            System.out.println("Choose Organ:"+
                    "\n\t1. Left Eye"+
                    "\n\t2. Right Eye+" +
                    "\n\t3. Heart"+
                    "\n\t4. Stomach"+
                    "\n\t5. Skin:"+
                    "\n\t6. Quit");
            int wahl = scanner.nextInt();
            switch (wahl){
                case 1:
                    patient.getLefteye().getDetails();
                    if (patient.getLefteye().isOpen()){
                        System.out.println("\t\t1. Close Eye");
                        if (scanner.nextInt()==1){
                            patient.getLefteye().close();
                        }else continue;
                    }else {
                        System.out.println("\t\t1. Open Eye");
                        if (scanner.nextInt()==1){
                            patient.getLefteye().open();
                        }else continue;
                    }
                case 2:
                    patient.getLefteye().getDetails();
                    if (patient.getRighteye().isOpen()){
                        System.out.println("\t\t1. Close Eye");
                        if (scanner.nextInt()==1){
                            patient.getRighteye().close();
                        }else continue;
                    }else {
                        System.out.println("\t\t1. Open Eye");
                        if (scanner.nextInt()==1){
                            patient.getRighteye().open();
                        }else continue;
                    }
                case 3:
                    patient.getHeart().getDetails();
            }
        }

    }
}
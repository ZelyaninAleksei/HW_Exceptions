import Controller.ControllerUserData;
import Model.FileWriterClass;
import Model.ModelClass;

public class App {
    public static void main(String[] args) throws Exception {
        ControllerUserData contr = new ControllerUserData();
        ModelClass mc = new ModelClass();
        mc.parsingData(contr.checkUserData());
        System.out.println(mc);
        FileWriterClass.writeFile(mc.getSurname(), mc);
    }
}

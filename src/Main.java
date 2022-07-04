import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
        Database names = new Database("test.txt",10);

        names.deleteRecord(0);

        for (int i = 0; i < names.getRecordCount(); i++) {
            System.out.println(names.getRecord(i));
        }

    }

    private void addNames(Database names){
        names.appendRecord("Jake");
        names.appendRecord("Charlie");
        names.appendRecord("Ethan");
        names.appendRecord("Stasio");
        names.appendRecord("Max");
        names.appendRecord("Fish");
    }
}

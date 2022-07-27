package decorator.inputstream;


public class InputStreamTest {

    public static void main(String[] args) throws Exception {
        LowerCaseInputSteram lowerCaseInputSteram = new LowerCaseInputSteram(System.in);

        int read = lowerCaseInputSteram.read();

        System.out.println("read = " + read);
    }
}

package decorator.inputstream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputSteram extends FilterInputStream {

    public LowerCaseInputSteram(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }
}

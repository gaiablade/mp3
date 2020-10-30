package jenkins.model;

import static org.junit.Assert.assertTrue;

import jenkins.model.IdStrategy;
import org.junit.Test;
import org.junit.Rule;
import java.*;
import javax.annotation.Nonnull;

public class MyTest extends IdStrategy {
    @Test
    public void MyIdTest1() {
        String s = this.idFromFilename("file$0065.txt");
        assertTrue(s == "filee.txt");
    }

    @Test
    public void MyIdTest2() {
        String s = this.idFromFilename("file$005A");
        assertTrue(s == "fileZ.txt");
    }

    @Override
    public String filenameOf(@Nonnull String id) {
        return null;
    }

    @Override
    public String keyFor(@Nonnull String id) {
        return null;
    }

    @Override
    public int compare(@Nonnull String id1, @Nonnull String id2) {
        return 0;
    }
}
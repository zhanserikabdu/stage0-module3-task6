package lang.print.gaps.task6;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class IntegerTypeCastingTest extends BaseIOTest {
    @Test
    public void mainTestCasting() {
        IntegerTypeCasting.main(null);

        assertEquals("1000\n1000\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void containsNoRawNumbersPrinting() throws IOException {
        Path path = Paths.get("src/main/java/lang/print/gaps/task6/IntegerTypeCasting.java");
        List<String> strings = Files.readAllLines(path);
        List<String> castedRows = strings.stream()
                .filter(line ->
                        line.contains("(int)"))
                .collect(Collectors.toList());

        List<String> twoNames = strings.stream()
                .filter(line ->
                        line.contains("first") || line.contains("second"))
                .collect(Collectors.toList());
        assertEquals(1, castedRows.size());
        assertEquals(4, twoNames.size());
    }
}
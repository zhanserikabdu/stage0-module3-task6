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

class PrePostIncrementTest extends BaseIOTest {

    @Test
    void mainMeetsRequirements() {
        String expected = """
                        Expected x is 40, x = 40
                        The updated value of a = 6, b = 7, c = 13 and d = 15
                        """;

        PrePostIncrement.main(null);

        assertEquals(expected, updateLineSpliterators(outContent.toString()));
    }

    @Test
    void containsNoRawNumberAdding() throws IOException {
        Path path = Paths.get("src/main/java/lang/print/gaps/task6/PrePostIncrement.java");
        List<String> strings = Files.readAllLines(path);
        List<String> castedRows = strings.stream()
                .filter(line ->
                        line.contains("+ 1") || line.contains("+1"))
                .collect(Collectors.toList());

        assertEquals(0, castedRows.size());
    }
}
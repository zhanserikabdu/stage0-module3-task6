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

class OperatorPrecedenceTest extends BaseIOTest {

    private static final String RAW_NUMBER_SOUT = "^.+(System\\.out\\.println\\D+\\d+\\D+);";


    @Test
    void mainMeetsExpectations() {
        OperatorPrecedence.main(null);

        assertEquals("8\nfalse\n5\n", updateLineSpliterators(outContent.toString()));
    }


    @Test
    void containsNoRawOutputs() throws IOException {
        Path path = Paths.get("src/main/java/lang/print/gaps/task6/OperatorPrecedence.java");
        List<String> strings = Files.readAllLines(path);
        List<String> castedRows = strings.stream()
                .filter(line ->
                        line.matches(RAW_NUMBER_SOUT))
                .collect(Collectors.toList());

        assertEquals(0, castedRows.size());
    }
}
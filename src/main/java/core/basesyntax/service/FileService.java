package core.basesyntax.service;

import java.util.List;

public interface FileService {

    List<String> readFromFile(String filePath);

    void writeInFile(String report, String filePath);
}

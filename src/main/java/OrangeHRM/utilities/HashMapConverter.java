package OrangeHRM.utilities;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class HashMapConverter {
    String jsonContent;
    public List<HashMap<String, String>> getJsonDataToHashMap(String Filepath) throws IOException {
        jsonContent = FileUtils.readFileToString(new File(Filepath), StandardCharsets.UTF_8);
        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String, String>> Data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
        });
        return Data;
    }
}

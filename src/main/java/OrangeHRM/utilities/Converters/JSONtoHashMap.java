package OrangeHRM.utilities.Converters;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class JSONtoHashMap {
    private static Object[][] readJosn(String fileName, String jsonObj) {
        //TODO - File to read data
        File file = new File(fileName);
        JsonElement jsonElement = null;
        try {
            jsonElement = JsonParser.parseReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assert jsonElement != null;
        JsonObject jsonObj1 = jsonElement.getAsJsonObject();
        JsonArray jsonArray = jsonObj1.get(jsonObj).getAsJsonArray();

        Object[][] testData = new Object[jsonArray.size()][1];

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject jsonObj2 = jsonArray.get(i).getAsJsonObject();
            Map<Object, Object> map = new HashMap<>();

            for (String key : jsonObj2.keySet()) {
                String value = jsonObj2.get(key).getAsString();
                map.put(key, value);
            }
            testData[i][0] = map;
        }
        return testData;
    }

    @DataProvider
    public static Object[][] loginLogoutValidationTest() {
        return readJosn("src/test/java/OrangeHRM/testData/dataSets.json", "dataSet1");
    }

    @DataProvider
    public static Object[][] MultipleLoginLogoutValidationTest() {
        return readJosn("src/test/java/OrangeHRM/testData/dataSets.json", "dataSet2");
    }

}

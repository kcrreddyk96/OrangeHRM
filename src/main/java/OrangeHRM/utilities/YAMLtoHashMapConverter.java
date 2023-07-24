package OrangeHRM.utilities;

import org.testng.annotations.DataProvider;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class YAMLtoHashMapConverter extends Browser{

    @DataProvider
    public static Object[][] yamlDataProvider(){
        return readYAML("src/test/java/OrangeHRM/testData/dataSet.yml");
    }

    private static Object[][] readYAML(String fileName) {
        //TODO - InputStream to read data
        InputStream inputStream = null;
        try{
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        Yaml yaml = new Yaml();

        //TODO - Read the YAML File
        Map <String, Object> YamlData = yaml.load(inputStream);

        //TODO - Creating Java Array to Store YAML Data
        Object[][] testData = new Object[1][1];
        testData[0][0] = YamlData;
        return testData;
    }
}

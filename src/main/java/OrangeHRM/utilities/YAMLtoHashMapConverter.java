package OrangeHRM.utilities;

import org.testng.annotations.DataProvider;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class YAMLtoHashMapConverter extends Browser {
    private static Object[][] readYAML(String fileName, String yamlObj) {
        //TODO - InputStream to read data
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //TODO - Read the YAML File
        Yaml yaml = new Yaml();
        Map<String, Object> YamlData = yaml.load(inputStream);

        //TODO - Creating Java Array to Store YAML Data
        Object[][] testData = new Object[1][1];
        // testData[0][0] = YamlData; //TODO - for Single dataSet
        testData[0][0] = YamlData.get(yamlObj);
        return testData;
    }

/*
    //TODO - For Single DataSet
    @DataProvider
    public static Object[][] yamlDataProvider(){
        return readYAML("src/test/java/OrangeHRM/testData/dataSet.yml");
    }
*/

    //TODO - For Multiple Data Items in DataSets
    @DataProvider
    public static Object[][] searchByUserName() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "searchByUserName");
    }

    @DataProvider
    public static Object[][] searchByUserRole() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "searchByUserRole");
    }

    @DataProvider
    public static Object[][] searchByEmpName() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "searchByEmpName");
    }

    @DataProvider
    public static Object[][] searchByStatus() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "searchByStatus");
    }

    @DataProvider
    public static Object[][] accessAndEditGeneralInformation() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "accessAndEditGeneralInformation");
    }

    @DataProvider
    public static Object[][] searchLocations() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "searchLocations");
    }

    @DataProvider
    public static Object[][] addLocation() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "addLocation");
    }

    @DataProvider
    public static Object[][] searchORGStructure() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "searchORGStructure");
    }

    @DataProvider
    public static Object[][] changeOrganizationStructure() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "changeOrganizationStructure");
    }

    @DataProvider
    public static Object[][] addOrganizationUnit() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "addOrganizationUnit");
    }

    @DataProvider
    public static Object[][] addAdminUser() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "addAdminUser");
    }

    @DataProvider
    public static Object[][] adminAddJobTitles() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddJobTitles");
    }

    @DataProvider
    public static Object[][] adminAddPayGrades() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddPayGrades");
    }

    @DataProvider
    public static Object[][] adminAddingNewEmploymentStatus() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddingNewEmploymentStatus");
    }

    @DataProvider
    public static Object[][] adminAddJobCategories() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddJobCategories");
    }

    @DataProvider
    public static Object[][] adminAddWorkshift() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddWorkshift");
    }


}

package OrangeHRM.utilities.Converters;

import OrangeHRM.utilities.Browser;
import org.testng.annotations.DataProvider;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class YAMLtoHashMap extends Browser {
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
        return readYAML("src/test/java/OrangeHRM/testData/singleDataSet.yml");
    }
*/

    //TODO - For Multiple Data Items in DataSets
    @DataProvider
    public static Object[][] adminSearchByUserName() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminSearchByUserName");
    }

    @DataProvider
    public static Object[][] adminSearchByUserRole() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminSearchByUserRole");
    }

    @DataProvider
    public static Object[][] adminSearchByEmpName() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminSearchByEmpName");
    }

    @DataProvider
    public static Object[][] adminSearchByStatus() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminSearchByStatus");
    }

    @DataProvider
    public static Object[][] adminAddAdminUser() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddAdminUser");
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
    public static Object[][] adminEditingGeneralInformationVerification() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminEditingGeneralInformationVerification");
    }

    @DataProvider
    public static Object[][] adminSearchORGStructure() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminSearchORGStructure");
    }

    @DataProvider
    public static Object[][] adminChangeOrganizationStructure() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminChangeOrganizationStructure");
    }

    @DataProvider
    public static Object[][] adminAddOrganizationUnit() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddOrganizationUnit");
    }

    @DataProvider
    public static Object[][] adminSetOperationsOnSkill() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminSetOperationsOnSkill");
    }

    @DataProvider
    public static Object[][] adminAddNewSkillsRecord() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddNewSkillsRecord");
    }

    @DataProvider
    public static Object[][] adminSetOperationsOnEducation() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminSetOperationsOnEducation");
    }

    @DataProvider
    public static Object[][] adminAddNewEductationRecord() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddNewEductationRecord");
    }

    @DataProvider
    public static Object[][] adminSetOperationsOnLicenses() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminSetOperationsOnLicenses");
    }

    @DataProvider
    public static Object[][] adminAddNewLicenseRecord() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddNewLicenseRecord");
    }

    @DataProvider
    public static Object[][] adminSetOperationsOnLanguages() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminSetOperationsOnLanguages");
    }

    @DataProvider
    public static Object[][] adminAddNewLanguageRecord() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddNewLanguageRecord");
    }

    @DataProvider
    public static Object[][] adminSetOperationsOnMemberships() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminSetOperationsOnMemberships");
    }

    @DataProvider
    public static Object[][] adminSearchNationalitiesRecords() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminSearchNationalitiesRecords");
    }

    @DataProvider
    public static Object[][] adminAddNewNationalitiesRecord() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddNewNationalitiesRecord");
    }

    @DataProvider
    public static Object[][] adminAddingNewNationalitiesRecord() {
        return readYAML("src/test/java/OrangeHRM/testData/dataSets.yml", "adminAddingNewNationalitiesRecord");
    }

}

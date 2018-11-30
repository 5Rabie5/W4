package robodog;


import java.util.*;

public class RobodogApplication {
    public static void main(String[] args) {
        FileReader fileReader = new robodog.FileReader();
        List<String> lines = fileReader.getLines("robodog/robodog.txt");
        Set<String> result = new HashSet<>();
        for (String line : lines) {
            line = cleanLine(line);
            result.add(line);
        }
        System.out.println(result.size());
        System.out.println(result);

List<String> cleanList= new ArrayList<>();

        for (String line : lines) {

            line = cleanLine(line);
            cleanList.add(line);
        }

        Map<String, Integer> emptyMap = new HashMap<>();
        Map<String, Integer> resultMap = new HashMap<>();

        resultMap=transferFromListToMap(cleanList,emptyMap(String,Integer  ));
        

    }

    public static String cleanLine(String line) {
        String result = line.replaceAll("!", "");
        return result;
    }


    public static Map<String, Integer> transferFromListToMap(List<String> list, Map<String, Integer> roboDogMap, String key, Integer value) {

        for (String line : list) {
            if (!roboDogMap.keySet().contains(line)) {
                key = line;
                value = 1;
                roboDogMap.put(key, value);
            } else {

                value = value + 1;

            }
        }

        return roboDogMap;
    }

}

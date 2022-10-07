package week3.date221007.miniProject.domain;

import java.util.HashMap;
import java.util.Map;

public class SidoCodeMap {
    private Map<Integer, String> sidoCodeMap;

    public SidoCodeMap() {
        sidoCodeMap = new HashMap<>();
        sidoCodeMap.put(11,"서울특별시");
        sidoCodeMap.put(26,"부산광역시");
        sidoCodeMap.put(27,"대구광역시");
        sidoCodeMap.put(28,"인천광역시");
        sidoCodeMap.put(29,"광주광역시");
        sidoCodeMap.put(30,"대전광역시");
        sidoCodeMap.put(31,"울산광역시");
        sidoCodeMap.put(36,"세종특별자치시");
        sidoCodeMap.put(41,"경기도");
        sidoCodeMap.put(42,"강원도");
        sidoCodeMap.put(43,"충청북도");
        sidoCodeMap.put(44,"충청남도");
        sidoCodeMap.put(45,"전라북도");
        sidoCodeMap.put(46,"전라남도");
        sidoCodeMap.put(47,"경상북도");
        sidoCodeMap.put(48,"경상남도");
        sidoCodeMap.put(50,"제주특별자치도");
    }

    public Map<Integer, String> getSidoCodeMap() {
        return sidoCodeMap;
    }
}

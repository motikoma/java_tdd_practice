package sushi;

import java.util.*;

public class Conveyer {

    private static final int NoNeedAddNetaNum = 5;

    private Map<String, Integer> netaMap;
    private List<String> netaList;

    public Conveyer() {
        this.netaMap = new LinkedHashMap<>();
        this.netaList = new ArrayList<>();
    }

    public List<String> getNetaList() {
        this.netaMap.forEach((k, v) -> {
            if(v >= NoNeedAddNetaNum) return;
            this.netaList.add(k);
        });

        return netaList;
    }

    public void add(String neta) {
        if(this.netaMap.containsKey(neta)) {
            int count = this.netaMap.get(neta);
            count++;
            this.netaMap.put(neta, count);
        } else {
            this.netaMap.put(neta, 1);
        }
    }
}

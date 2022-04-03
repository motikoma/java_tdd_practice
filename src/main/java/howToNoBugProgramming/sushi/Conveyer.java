package howToNoBugProgramming.sushi;

import java.util.*;

public class Conveyer {

    private static final int NoNeedAddNetaNum = 5;
    private Map<String, Integer> netaMap = new LinkedHashMap<>();

    public List<Neta> getNetaList() {
        List<Neta> netaList = new ArrayList<>();
        this.netaMap.forEach((k, v) -> {
            if(v >= NoNeedAddNetaNum) return;
            netaList.add(new Neta(k, v));
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

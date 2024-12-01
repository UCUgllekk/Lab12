package main.java.org.example.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StampingVisitor {
    private boolean inGroup;

    public Map onGroupStart(Group group, Map<String, String> headers) {
        this.inGroup = true;
        Map<String, Object> res = new HashMap<>();
        List<Boolean> inGroupList = new ArrayList<>();
        res.put("in group", inGroupList);
        res.put("stamped headers", List.of("in_group"));
        return res;
    }

    public void onGroupEnd(Group group, Map<String, String> headers) {
        this.inGroup = false;
    }

    public Map onSignature(Task sig, Map<String, String> headers) {
        Map<String, Object> res = new HashMap<>();
        List<Boolean> inGroupList = new ArrayList<>();
        res.put("in group", inGroupList);
        res.put("stamped headers", List.of("in_group"));
        return res;
    }
}
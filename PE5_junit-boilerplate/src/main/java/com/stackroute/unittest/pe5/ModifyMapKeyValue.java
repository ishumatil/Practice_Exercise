package com.stackroute.unittest.pe5;

import java.util.Map;

public class ModifyMapKeyValue {

    public Map<String,String> modifyMapKeyValueInMap(Map<String, String> map){
        for(Map.Entry<String,String> entry:map.entrySet()){
            if(entry.getKey().equals("val1")&&entry.getValue()!=null){
                String value=entry.getValue();
                map.put("val1"," ");
                map.put("val2",value);
            }
            else{

                continue;
            }
        }
        return map;
    }
}

package com.germplasm.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @author scx
 * @date 2018/1/22 10:50
 */
public class PageUtil {
    public static Map<String,Object> getRowNum(Integer curPage, Integer pageSize)
    {
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("curRow", (curPage-1)*pageSize);
        map.put("pageSize", pageSize);
        return map;
    }
}

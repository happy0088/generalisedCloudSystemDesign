package com.absonworld.cloud;

import java.util.HashMap;
import java.util.Map;

public class CloudFactory {
    public static final Map<String, ICloud> cloudMap = new HashMap() {
        {
            put("AWS", AWSCloud.BASE_INSTANCE);
            put("AZURE", AzureCloud.BASE_INSTANCE);
        }
    };


}

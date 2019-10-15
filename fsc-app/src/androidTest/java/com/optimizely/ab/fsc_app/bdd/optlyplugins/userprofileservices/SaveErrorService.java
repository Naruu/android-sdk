package com.optimizely.ab.fsc_app.bdd.optlyplugins.userprofileservices;

import java.util.ArrayList;
import java.util.Map;

public class SaveErrorService extends NormalService {
    public SaveErrorService(ArrayList<Map> userProfileList) {
        super(userProfileList);
    }

    public void save(Map<String, Object> userProfile) throws Exception {
        throw new Exception("SaveError");
    }
}
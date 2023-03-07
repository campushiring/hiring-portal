package org.credex.hiring.portal.model;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

public enum CampusType {
    ON("ON"),
    OFF("OFF");

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }
    @JsonCreator
    public static CampusType fromValue(String value) {
        for (CampusType b : CampusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }


    private String value;

    CampusType(String value){
        this.value=value;
    };


}

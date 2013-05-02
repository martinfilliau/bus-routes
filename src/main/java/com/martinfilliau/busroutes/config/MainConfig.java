package com.martinfilliau.busroutes.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author martinfilliau
 */
public class MainConfig extends Configuration {
    
    @NotEmpty
    @JsonProperty
    private String neoPath = "test";

    @NotEmpty
    @JsonProperty
    private String importOx = "data.json";

    public String getNeoPath() {
        return this.neoPath;
    }
    
    public String getImportOx() {
        return this.importOx;
    }
}

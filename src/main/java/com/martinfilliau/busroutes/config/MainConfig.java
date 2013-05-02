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

    public String getNeoPath() {
        return this.neoPath;
    }
}

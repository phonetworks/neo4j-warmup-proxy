package org.phonetworks.neo4j.warmupproxy.binding;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.net.URI;

@Component
@ConfigurationPropertiesBinding
public class URIConverter implements Converter<String, URI> {

    @Override
    public URI convert(@Nullable String value) {
        if (StringUtils.isEmpty(value)){
            return null;
        }

        return URI.create(value);
    }
}
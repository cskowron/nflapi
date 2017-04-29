package core;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Cory on 4/29/2017.
 */
public class CommonUtils {

    /**
     * Convenience method for setting up the Jackson object mapper and de-serializing a JSON object into a bean.
     *
     * @param jsonString The JSON to map to a bean
     * @param objectType The Class type to which the JSON will be mapped
     * @param <T>
     * @return An object of type T that contains the deserialized json in bean-form
     * @throws java.io.IOException
     */
    public static <T> T getObjectFromJson(String jsonString, Class<T> objectType) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // Ignore unknown properties in the JSON (if you want to handle the unknown properties, implement mapper.addHandler(new DeserializationProblemHandler()) instead
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        return mapper.readValue(jsonString, objectType);
    }
}

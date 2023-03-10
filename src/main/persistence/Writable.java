package persistence;

import org.json.JSONObject;

// **heavily based on JsonSerializationDemo project**
// Anything that needs to be written to a json file (i.e. saved) needs to implement
// the methods below
public interface Writable {

    // EFFECTS: returns this as JSON object
    JSONObject toJson();
}

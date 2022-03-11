package edu.uci.ics.asterix.result;

import edu.uci.ics.asterix.result.metadata.Datatype;

import java.util.HashMap;

// This is a singleton... Or is it?
public class HashObject {
    private static HashMap<Tuple, Datatype> result = null;
    private static HashMap<Tuple, Boolean> found = null;
    private static HashMap<Tuple, String> settotype = null;

    private HashObject() {
    }

    public static HashMap<Tuple, Boolean> getFound() {
        if (found == null) {
            found = new HashMap<Tuple, Boolean>();
        }
        return found;
    }

    public static Boolean getFound(Tuple s) {
        if (found == null) {
            found = new HashMap<Tuple, Boolean>();
        }
        return found.get(s);
    }

    public static void setFound(Tuple s, Boolean bo) {
        if (found == null) {
            found = new HashMap<Tuple, Boolean>();
        } else found.put(s, bo);
    }

    public static HashMap<Tuple, Datatype> getResult() {
        if (result == null)
            result = new HashMap<Tuple, Datatype>();
        return result;
    }

    public static Datatype getResult(Tuple s) {
        if (result == null)
            result = new HashMap<Tuple, Datatype>();
        return result.get(s);
    }

    public static void setResult(Tuple s, Datatype t) {
        if (result == null)
            result = new HashMap<Tuple, Datatype>();
        result.put(s, t);
    }

    public static String getSettotype(Tuple s) {
        if (settotype == null)
            settotype = new HashMap<Tuple, String>();
        return settotype.get(s);
    }

    public static void setSettotype(Tuple t, String s) {
        if (settotype == null)
            settotype = new HashMap<Tuple, String>();
        settotype.put(t, s);
    }


}
